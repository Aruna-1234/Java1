
import java.util.Scanner;
public class checkPrime {
    static boolean isPrime(int n) {
        for(int i=2;i*i<=n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean result=isPrime(n);
        System.out.println(result);
    }
    
}
