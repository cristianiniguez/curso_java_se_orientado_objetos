import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Cristian Iñiguez", "Odontology");
        System.out.println(myDoctor.name); // Cristian Iñiguez
        System.out.println(myDoctor.speciality); // Odontology
    }
}
