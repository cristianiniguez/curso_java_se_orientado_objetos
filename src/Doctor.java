public class Doctor {
    static int id = 0; // Autoincrement
    String name;
    String speciality;

    Doctor() {
        System.out.println("Building Doctor object");
        id++;
    }

    Doctor(String name, String speciality) {
        System.out.println("Doctor's assigned name is " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("Doctor ID: " + id);
    }
}
