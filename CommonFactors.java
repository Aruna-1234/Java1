import java.util.Scanner;

public class CommonFactors {
    static void printCommonFactors(int n1, int n2) {
       for(int i=1;i<=n1;i++) {          // for(int i=n1;i>=1;i--){ for another order
         if(n1%i==0 && n2%i==0) {         // break ;  after print stmt print only highes value
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        printCommonFactors(n1,n2);
    
    }
    
}
