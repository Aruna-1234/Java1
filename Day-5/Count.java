import java.util.Scanner;
public class Count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }                                                   
         int max=0;                                        
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println(max);
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==max) {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
}
