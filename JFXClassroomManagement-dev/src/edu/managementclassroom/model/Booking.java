package edu.managementclassroom.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class Booking {
    private Date beginDateOfBooking;
    private Date endDateOfBooking;
    private Teacher teacherBooking;
    private Classroom classroomBooking;

    public Booking(Date dateDebutReservation, Date endDateOfBooking, Teacher teacherBooking, Classroom classroomBooking
    ) {
        this.beginDateOfBooking = dateDebutReservation;
        this.endDateOfBooking = endDateOfBooking;
        this.teacherBooking = teacherBooking;
        this.classroomBooking = classroomBooking;
    }
}
