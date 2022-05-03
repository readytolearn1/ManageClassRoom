package edu.managementclassroom.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Teacher {
    private String name;
    private String registrationNumber;
    private Booking booking;

    public Teacher(String nom, String registrationNumber, Booking booking) {
        this.name = nom;
        this.registrationNumber = registrationNumber;
        this.booking = booking;
    }
}
