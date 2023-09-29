import java.util.Scanner;
public class Prime2 {
static boolean isPrime(int n) {
    for(int i=2;i*i<=n;i++) {
        if(n%i==0) {
            return false;
        }

    }
    return true;
}
 static void printPrimes(int n) {
       int count=0;
    for(int i=2;count<n;i++) {
        if(isPrime(i)) {
            System.out.println(i);
            count++;
        }
    }
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPrimes(n);
    }
    
}
