package thuc_hanh;

public class Student {
    private int id;
    private String name;
    private String email;
    private double gpa;
    private static int idElement = 1;

    public Student( String name, String email, double gpa) {
        this.id = idElement;
        this.name = name;
        this.email = email;
        this.gpa = gpa;
        idElement ++;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
