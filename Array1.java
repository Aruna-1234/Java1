// sum of 4 elements and min value,max value in that

import java.util.Scanner;
public class Array1 {
    static int sum(int[] ar) {
        int sum=0;
        for(int i=0;i<ar.length;i++) {
            sum=sum+ar[i];
        }
        return sum;
    }
    static int max(int[] ar) {
        int max=0;                                        //int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++) {
            if(ar[i]>max) {
                max=ar[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<ar.length;i++) {
            ar[i]=sc.nextInt();
        }
        int res=sum(ar);
        System.out.println(res);
        int result=max(ar);
        System.out.println(result);
        System.out.println(res-result);
}
}



