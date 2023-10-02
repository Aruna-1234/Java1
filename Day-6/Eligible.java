import java.util.Scanner;
class Eligible {
   
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter name");
    String name=sc.next();
    System.out.println("enter age");
    int age=sc.nextInt();
      Vote v=new Vote();
      v.details(name, age);
    v.setName( name);
        System.out.println(v.getName());
        v.setAge(age);
        System.out.println(v.getAge());
         String res=v.checkEligibility();
         System.out.println(res);

    
}
}
        