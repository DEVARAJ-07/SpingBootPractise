package com.ngp.SpringBoot.Controller;

import com.ngp.SpringBoot.Entities.Tracker;
import com.ngp.SpringBoot.Service.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/track")
public class TrackerController {
    @Autowired
    private TrackerService ts;

    @PostMapping("/create")
    ResponseEntity createUser (@RequestBody Tracker t){
        return new ResponseEntity<>(ts.createTracker(t), HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public List<Tracker> getAll(){
        return ts.getAllTrackers();
    }

    @GetMapping("/{id}")
    public Tracker getById(@PathVariable int id)
    {
        return ts.getTracker(id);
    }

    @PutMapping("/update")
    public Tracker update(@RequestBody Tracker t)
    {
        return ts.updateTracker(t);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id)
    {
        return ts.deleteTracker(id);
    }

    @GetMapping("/page")
    public Page<Tracker> getAllPages(@RequestParam int page,@RequestParam int size){
        return ts.getAllTrackerPages(page, size);
    }
}
