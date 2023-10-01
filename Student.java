import java.util.Scanner;

class Student {
    String name;
    int age;
    int roll_no;
    Scanner sc= new Scanner(System.in);
    void info(){
    System.out.println("Enter student's name: ");
     name = sc.next();

    System.out.println("Enter student's age: ");
     age = sc.nextInt();
    
    System.out.println("Enter student's roll_no: ");
    roll_no= sc.nextInt();

}
    public static void main(String[] args) {
        Student s= new Student();
        s.info();
        System.out.println("name:" + s.name);
        System.out.println("age:" + s.age);
        System.out.println("roll_no:" + s.roll_no);


        


        

        

        
    
    }
   
    
        
    }

