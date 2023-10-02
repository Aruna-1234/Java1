import java.util.Scanner;

class ClassEx{
    String name;
    int marks;
    
    void details( ){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter name:");
      name=sc.next();
    System.out.println("enter marks:");
     marks=sc.nextInt();
    }
    void result(){
if(marks>75) System.out.println(name+"pass");
else System.out.println(name+"fail");
    }

}