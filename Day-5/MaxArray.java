import java.util.Scanner;
public class MaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }                                                   // if we give -ve values for that
         int max=0;                                        //int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println(max);
        
    }
    
}
