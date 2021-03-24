import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Cristian Iñiguez", "Odontology");
        System.out.println(myDoctor.name); // Cristian Iñiguez
        System.out.println(myDoctor.speciality); // Odontology

        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight()); // 54.6 Kg.

        patient.setPhoneNumber("123456789"); // El número telefónico debe ser máximo de 8 dígitos
        System.out.println(patient.getPhoneNumber()); // null

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber()); // 12345678
    }
}
