import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<ar.length;i++) {
            ar[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<ar.length;i++) {
            sum=sum+ar[i];              //sum=sum*ar[i];
        }
        System.out.println(sum);
    }
    
}
