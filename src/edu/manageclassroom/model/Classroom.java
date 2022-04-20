package edu.manageclassroom.model;

import java.util.List;

public class Classroom {
    private String nom;
    private int places;
    private ClassroomType classroomType;
    private ClassroomEquipment classroomEquipment;
    private Reservation reservation;

    public Classroom(String nom, int places, ClassroomType classroomType, ClassroomEquipment classroomEquipment) {
        this.nom = nom;
        this.places = places;
        this.classroomType = classroomType;
        this.classroomEquipment = classroomEquipment;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public ClassroomType getClassroomType() {
        return classroomType;
    }

    public void setClassroomType(ClassroomType classroomType) {
        this.classroomType = classroomType;
    }

    public ClassroomEquipment getClassroomEquipment() {
        return classroomEquipment;
    }

    public void setClassroomEquipment(ClassroomEquipment classroomEquipment) {
        this.classroomEquipment = classroomEquipment;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public void saveClassroom(){
        DataBase.classrooms.add(this);
    }

    public List<Classroom> listClassroom(){
        return DataBase.classrooms;
    }
}
