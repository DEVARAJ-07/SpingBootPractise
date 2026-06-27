package com.ngp.SpringBoot;

import com.ngp.SpringBoot.Entities.Tracker;
import org.springframework.beans.factory.annotation.Autowired;
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
        return tr.findById(id).orElse(null);
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
}
