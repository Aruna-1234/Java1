// returns the index of highest value
import java.util.Scanner;
public class MaxIndex {
    static int maxIndex(int[] ar) {
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        for(int i=0;i<ar.length;i++) {
            if(ar[i]>max) {
                max=ar[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<ar.length;i++) {
            ar[i]=sc.nextInt();
        }
        int res=maxIndex(ar);
        System.out.println(res);
    }
    
}
