import java.util.Scanner;
class feeDetails {
   int fees;
   String course; 
   int year;

void fee() {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the fees");
    fees=sc.nextInt();
    System.out.println("enter the name of the course");
    course =sc.next();
    System.out.println("enter the year");
    year=sc.nextInt();

}
}
public class College {
    public static void main(String[] args) {
        feeDetails f=new feeDetails();
        f.fee();
        System.out.println("fees" + " = " + f.fees);
        System.out.println("course" + " = " + f.course);
        System.out.println("year" + " = " + f.year);
    }
}