import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName(); // Alejandro Rodriguez

        myDoctor.showId(); // Doctor ID: 1
        System.out.println(Doctor.id); // 1

        Doctor.id++;

        Doctor myDoctorMary = new Doctor();

        myDoctor.showId(); // Doctor ID: 3
        System.out.println(Doctor.id); // 3

        showMenu();
    }
}
