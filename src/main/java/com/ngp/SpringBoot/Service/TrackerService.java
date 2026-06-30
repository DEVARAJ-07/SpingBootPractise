package com.ngp.SpringBoot.Service;

import com.ngp.SpringBoot.Entities.Tracker;
import com.ngp.SpringBoot.Exception.TrackerNotFoundException;
import com.ngp.SpringBoot.Repository.TrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackerService {
    @Autowired
    private TrackerRepository tr;

    public Tracker createTracker(Tracker t) {
        return tr.save(t);
    }
    public List<Tracker> getAllTrackers(){
        return tr.findAll();
    }
    public Tracker getTracker(int id)
    {
        return tr.findById(id).orElseThrow(()-> new TrackerNotFoundException("Tracker with id "+id+" not Found"));
    }
    public Tracker updateTracker(Tracker t)
    {
        return tr.save(t);
    }
    public String deleteTracker(int id)
    {
        tr.deleteById(id);
        return "Deleted Successfully";
    }

    public Page<Tracker> getAllTrackerPages(int page, int size){
        Pageable pg = PageRequest.of(page, size);
        return tr.findAll(pg);
    }

}
