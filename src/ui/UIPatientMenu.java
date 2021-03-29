package ui;

import model.Doctor;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("Patient");
            System.out.println("Welcome " + UIMenu.patientLogged.getName());
            System.out.println("1. Book and appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    response = 0;
                    showBookAppointmentMenu();
                    break;
                case 2:
                    response = 0;

                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while (response != 0);
    }

    private static void showBookAppointmentMenu() {
        int response = 0;
        do {
            System.out.println(":: Book an appointment ::");
            System.out.println(":: Select date ::");

            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsWithAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = UIDoctorMenu.doctorsWithAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate(""));
                    doctorAppointments.put(j, UIDoctorMenu.doctorsWithAvailableAppointments.get(i));
                    doctors.put(k, doctorAppointments);
                }
            }

            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "");
            for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName() +
                    ". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                    ". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment:");
            System.out.println("1. Yes");
            System.out.println("2. Change data");

            response = Integer.valueOf(sc.nextLine());
            if (response == 1) {
                UIMenu.patientLogged.addAppointmentDoctor(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime()
                );
                showPatientMenu();
            }
        } while (response != 0);
    }

    private static void showPatientMyAppointment() {
        int response = 0;
        do {
            System.out.println(":: My Appointments ::");
            if (UIMenu.patientLogged.getAppointmentsDoctor().size() == 0) {
                System.out.println("You don't have appointments");
                break;
            }

            for (int i = 0; i < UIMenu.patientLogged.getAppointmentsDoctor().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " +
                        "Date: " + UIMenu.patientLogged.getAppointmentsDoctor().get(i).getDate() +
                        "Time: " + UIMenu.patientLogged.getAppointmentsDoctor().get(i).getTime() +
                        "\nDoctor: " + UIMenu.patientLogged.getAppointmentsDoctor().get(i).getDoctor().getName());
            }
            System.out.println("0. Return");
        } while (response != 0);
    }
}
