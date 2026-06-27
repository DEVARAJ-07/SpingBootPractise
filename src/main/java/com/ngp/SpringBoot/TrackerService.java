package com.ngp.SpringBoot;

import com.ngp.SpringBoot.Entities.Tracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackerService {
    @Autowired
    private TrackerRepository tr;

    public Tracker createTracker(Tracker t) {
        return tr.save(t);
    }
}
