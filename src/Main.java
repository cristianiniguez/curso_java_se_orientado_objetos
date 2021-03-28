import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Cristian Iñiguez", "felizpc1@gmail.com");

        myDoctor.addAvailableAppointment(new Date(), "4 PM");
        myDoctor.addAvailableAppointment(new Date(), "10 AM");
        myDoctor.addAvailableAppointment(new Date(), "1 PM");

        System.out.println(myDoctor);
        // model.User: Cristian Iñiguez
        // Email: Odontology
        // Address: null
        // Phone: null
        // Speciality: null
        // Available Appointments: [
        // Available Appointment
        // Date: Sun Mar 28 14:24:47 AMT 2021
        // Time: 4 PM,
        // Available Appointment
        // Date: Sun Mar 28 14:24:47 AMT 2021
        // Time: 10 AM,
        // Available Appointment
        // Date: Sun Mar 28 14:24:47 AMT 2021
        // Time: 1 PM]

        // for (model.Doctor.AvailableAppointment aa : myDoctor.getAvailableAppointments()) {
        //     System.out.println(aa.getDate() + " " + aa.getTime()); // Se imprimen las citas
        // }

        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        //System.out.println(patient);
        // model.User: Alejandra
        // Email: alejandra@gmail.com
        // Address: null
        // Phone: null
        // Age: null
        // Weight: 0.0 Kg.
        // Height: 0.0 Mts.
        // Blood: null
    }
}
