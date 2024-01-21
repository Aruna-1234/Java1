import java.util.Scanner;
class SumOfDigits {
    static int digitSum(int n) {
        int rem=0;
        int sum=0;
        while(n>0) {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=digitSum(n);
        System.out.println(res);

    }
}