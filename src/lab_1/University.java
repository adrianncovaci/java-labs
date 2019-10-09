package lab_1;

public class University {
    String name;
    int foundationYear;
    Student[] students;

    public University(String name, int foundationYear, Student[] students) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.students = students;
    }

    public double getAverage() {
        double media = 0;
        for (int i = 0; i < students.length; i++) {
            media += this.students[i].mark;
        }
        return media / this.students.length;
    }

    public void showUniversity() {
        StringBuilder msg = new StringBuilder();
        for (int i = 0; i < this.students.length; i++) {
            msg.append(this.students[i].name);
            msg.append(" ");
        }
        double media = this.getAverage();
        System.out.println("Universitatea " + this.name + ", fondata in " + this.foundationYear + " cu elevii : " + msg + ", cu media " + media);
    }
}
