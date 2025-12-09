public class Student {

    String name;
    String id;
    int age;
    String email;
    String phone;
    String address;

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.id = "E251002";
        s1.name = "Al Jaber";
        s1.age = 21;
        s1.email = "aljaber54325@gmail.com";
        s1.phone = "+8801764587452";
        s1.address = "Dc road, west bakalia, mia baper mosjid";

        System.out.println("Name: " + s1.name);
        System.out.println("ID: " + s1.id);
        System.out.println("Age: " + s1.age);
        System.out.println("Email: " + s1.email);
        System.out.println("Phone: " + s1.phone);
        System.out.println("Address: " + s1.address);
    }
}

