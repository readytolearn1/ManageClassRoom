package edu.manageclassroom.model;

import java.util.Date;
import java.util.List;

public class Reservation {
    private Date dateDebutReservation;
    private Date dateFinReservation;
    private Enseignant enseignantReservant;
    private Classroom classroomReserve;

    public Reservation(Date dateDebutReservation, Date dateFinReservation, Enseignant enseignantReservant,
                       Classroom classroomReserve) {
        this.dateDebutReservation = dateDebutReservation;
        this.dateFinReservation = dateFinReservation;
        this.enseignantReservant = enseignantReservant;
        this.classroomReserve = classroomReserve;
    }

    public Date getDateDebutReservation() {
        return dateDebutReservation;
    }

    public void setDateDebutReservation(Date dateDebutReservation) {
        this.dateDebutReservation = dateDebutReservation;
    }

    public Date getDateFinReservation() {
        return dateFinReservation;
    }

    public void setDateFinReservation(Date dateFinReservation) {
        this.dateFinReservation = dateFinReservation;
    }

    public Enseignant getEnseignantReservant() {
        return enseignantReservant;
    }

    public void setEnseignantReservant(Enseignant enseignantReservant) {
        this.enseignantReservant = enseignantReservant;
    }

    public Classroom getClassroomReserve() {
        return classroomReserve;
    }

    public void setClassroomReserve(Classroom classroomReserve) {
        this.classroomReserve = classroomReserve;
    }

    public void saveReservation(){
        DataBase.reservations.add(this);
    }
    public List<Reservation> listRservation(){
        return DataBase.reservations;
    }
}
