package com.ngp.SpringBoot.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Tracker {
    @Id
    @GeneratedValue
    int id;
    @NotBlank
    String name;
    @NotNull
    String batch;
    @Email
    String email;

    String Number;
}
