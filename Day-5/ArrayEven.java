import java.util.Scanner;
    public class ArrayEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        } 
        int value=0;
        for(int i=0;i<arr.length/2;i++) {
          // if(arr[i]%2==0) {              //if(arr[i]%2!=0) {
                                         
            System.out.print(arr[i] + " ");
        //     value++;
        // }
    }
    System.out.println();
    System.out.println(value);
}

    
}
