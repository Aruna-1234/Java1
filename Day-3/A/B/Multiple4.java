package Day.B;
// if n divide by 3 print tap,if divide by 5 print academy it divides by both print wow
import java.util.Scanner;
public class Multiple4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(((n%3)==0)&&((n%5==0)))
        System.out.println("WOW");
        else if((n%3)==0)
        System.out.println("Tap");
        else if((n%5)==0)
        System.out.println("Academy");
    }
    
}
