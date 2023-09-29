import java.util.Scanner;
public class Prime1 {
    static boolean checkPrime(int n) {
        int count=0;
        for(int i=2;i<=n/2;i++) {
            if(n%i==0) {
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean result=checkPrime(n);
        System.out.println(result);
    }
    
}
