import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        User user = new Doctor("Cristian Iñiguez", "felizpc1@gmail.com");
        // user.showDataUser();
        // Empleado del Hospital: Cruz Verde
        // Departamento: Oncología

        User user1 = new User("Cristian Iñiguez", "felizpc1@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departemento: Geriatría");
            }
        };
        user1.showDataUser();
        // Doctor
        // Hospital: Cruz Verde
        // Departemento: Geriatría

        ISchedulable iSchedulable1 = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {
                // ...
            }
        };


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
