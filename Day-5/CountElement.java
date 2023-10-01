import java.util.Scanner;
public class CountElement { 
    static int countElement(int[] ar,int k) {
        int count=0;
        for(int i=0;i<ar.length;i++) {
            if(k==ar[i]) {
                count++;
            }
        }return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<ar.length;i++) {
            ar[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int res=countElement(ar,k);
        System.out.println(res);
    
}
    
}
