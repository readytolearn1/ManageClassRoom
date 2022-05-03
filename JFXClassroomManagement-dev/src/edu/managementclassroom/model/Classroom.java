package edu.managementclassroom.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Classroom {
    private String name;
    private int seatsNumber;
    private ClassroomType classroomType;
    private ClassroomEquipment classroomEquipment;
    private Booking booking;

    public Classroom(String name, int seatsNumber, ClassroomType classroomType, ClassroomEquipment classroomEquipment, Booking booking) {
        this.name = name;
        this.seatsNumber = seatsNumber;
        this.classroomType = classroomType;
        this.classroomEquipment = classroomEquipment;
        this.booking = booking;
    }
}
