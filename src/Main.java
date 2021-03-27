import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Cristian Iñiguez", "Odontology");

        myDoctor.addAvailableAppointment(new Date(), "4 PM");
        myDoctor.addAvailableAppointment(new Date(), "10 AM");
        myDoctor.addAvailableAppointment(new Date(), "1 PM");

        for (Doctor.AvailableAppointment aa : myDoctor.getAvailableAppointments()) {
            System.out.println(aa.getDate() + " " + aa.getTime()); // Se imprimen las citas
        }

        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        System.out.println(patient);
        // User: Alejandra
        // Email: alejandra@gmail.com
        // Address: null
        // Phone: null
        // Age: null
        // Weight: 0.0 Kg.
        // Height: 0.0 Mts.
        // Blood: null
    }
}
