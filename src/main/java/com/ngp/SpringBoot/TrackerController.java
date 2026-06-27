package com.ngp.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("track")
public class TrackerController {
    @Autowired
    private TrackerService tr;

    @GetMapping("get")
    String track(){
        tr.printTrack();
        return "Tracking...!!!";
    }
}
