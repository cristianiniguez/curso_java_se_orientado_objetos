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

/*
        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight()); // 54.6 Kg.

        patient.setPhoneNumber("123456789"); // El número telefónico debe ser máximo de 8 dígitos
        System.out.println(patient.getPhoneNumber()); // null

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber()); // 12345678
*/
    }
}
