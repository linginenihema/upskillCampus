public class Student extends AbstractUser {

    private int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public void displayUser() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Student Name : " + name);
    }
}