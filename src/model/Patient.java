package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentsDoctor = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentsNurse = new ArrayList<>();

    public Patient(String name, String email) {
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public ArrayList<AppointmentDoctor> getAppointmentsDoctor() {
        return appointmentsDoctor;
    }

    public void addAppointmentDoctor(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentsDoctor.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentsNurse() {
        return appointmentsNurse;
    }

    public void setAppointmentsNurse(ArrayList<AppointmentNurse> appointmentsNurse) {
        this.appointmentsNurse = appointmentsNurse;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAge: " + birthday +
                "\nWeight: " + getWeight() +
                "\nHeight: " + getHeight() +
                "\nBlood: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
    }
}
