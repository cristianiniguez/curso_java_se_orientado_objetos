import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        User user = new Doctor("Cristian Iñiguez", "felizpc1@gmail.com");
        user.showDataUser();
        // Empleado del Hospital: Cruz Verde
        // Departamento: Oncología

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
