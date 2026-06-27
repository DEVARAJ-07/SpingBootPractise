package com.ngp.SpringBoot.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Tracker {
    @Id
    @GeneratedValue
    int id;
    String name;
    String batch;
}
