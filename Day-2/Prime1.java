//prime numbers between two numbers
import java.util.Scanner;
public class Prime1 {
    static boolean isPrime(int n) {
        for(int i=2;i*i<=n;i++) {
            if(n%i==0) {
                return false;
            }
    
        }
        return true;
    }
     static void printPrimes(int n) {
        int n1;
        int n2;
        for(int i=n1;i<=n2;i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);  
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    printPrimes(n);

}
}
