package com.ngp.SpringBoot.Repository;

import com.ngp.SpringBoot.Entities.Tracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TrackerRepository extends JpaRepository<Tracker,Integer> {

}
