package edu.manageclassroom.model;

import java.util.List;

public class Enseignant {
    private String nom;
    private String matricule;
    private Reservation reservation;

    public Enseignant(String nom, String matricule) {
        this.nom = nom;
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public void saveEnseignant(){
        DataBase.enseignants.add(this);
    }

    public List<Enseignant> listEnseignant(){
       return DataBase.enseignants;
    }
}
