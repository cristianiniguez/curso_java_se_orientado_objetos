public class Doctor {
    int id;
    String name;
    String speciality;

    Doctor() {
        System.out.println("Building Doctor object");
    }

    Doctor(String name) {
        System.out.println("Doctor's assigned name is " + name);
    }

    public void showName() {
        System.out.println(name);
    }
}
