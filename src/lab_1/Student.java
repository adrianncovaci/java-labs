package lab_1;

public class Student {
    String name;
    int age;
    double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public void showStudent() {
        System.out.println("Studentul " + this.name + ", de varsta " + this.age + ", cu nota " + this.mark);
    }
}
