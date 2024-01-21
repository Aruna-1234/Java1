import java.util.Scanner;
public class Arrays2 {
    static int[] products(int[] ar) {
        int p=1;
        for(int i=0;i<ar.length;i++) {
            p=p*ar[i];
        }
        int[] res=new int[ar.length];
        for(int i=0;i<res.length;i++) {
            res[i]=p/ar[i];
        }
        return res;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      int[] ar=new int[n];
     for(int i=0;i<ar.length;i++) {
     ar[i]=sc.nextInt();
}
      int[] result=products(ar);
      for(int i=0;i<result.length;i++) {
        System.out.print(result[i] + " ");

        
    }
}
}
    

