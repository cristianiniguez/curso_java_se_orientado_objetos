package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Choose and option");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    response = 0;
                    authUser(1);
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println((i + 1) + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }

    private static void authUser(int userType) {
        // userType = 1 -> Doctor
        // userType = 2 -> Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez", "alejandro@gmail.com"));
        doctors.add(new Doctor("Karen Sosa", "karen@gmail.com"));
        doctors.add(new Doctor("Rocío Gómez", "rocio@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahí Salgado", "anahi@gmail.com"));
        patients.add(new Patient("Roberto Rodriguez", "roberto@gmail.com"));
        patients.add(new Patient("Carlos Sánchez", "carlos@gmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [email@gmail.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1) {
                for (Doctor d : doctors) {
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true;
                        // Obtener datos del usuario logueado
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            if (userType == 2) {
                for (Patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        // Obtener datos del usuario logueado
                        patientLogged = p;
                        // Show Patient Menu
                    }
                }
            }

        } while (!emailCorrect);
    }
}
