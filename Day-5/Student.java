public class Student extends Person {
    private String studentId;
    public Student() {
        super();
        this.studentId=studentId;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId=studentId;
    }
    public void study() {
        System.out.println(getName() + "is studying");
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: "+ studentId);
    }
}
