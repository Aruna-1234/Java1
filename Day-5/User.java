import java.util.Scanner;
public class User {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.next();
        System.out.println("enter age");
        int age=sc.nextInt();
        Person p1=new Person();
       p1.setName( name);
        System.out.println(p1.getName());
        p1.setAge(age);
        System.out.println(p1.getAge());

        System.out.println("Person Details");
        p1.displayDetails();
        System.out.println("for student details");
        System.out.println("enter id:");
        String id=sc.next();

        Student s=new Student();
        s.setName( name);
        System.out.println(s.getName());
        s.setAge(age);
        System.out.println(s.getAge());
        s.setStudentId(id);
        System.out.println(s.getStudentId());
        
        System.out.println("\nStudent Details:");
        s.displayDetails();


    }
    
}
