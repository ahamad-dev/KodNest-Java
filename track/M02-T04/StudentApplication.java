class Student {
    int roll;
    String name;
    float height;

    void run() {
        System.out.println("Running");
    }

    void sleeping() {
        System.out.println("sleeping");
    }
}

public class StudentApplication {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 5;
        s1.name = "Ali";
        s1.height = 5.5f;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleeping();
    }
}
