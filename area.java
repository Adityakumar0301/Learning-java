import java.util.Scanner;

public class area{
    static void main() {

       Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius");
       double r=sc.nextInt();
       double pi=3.14;
       double area=pi*r*r ;
       System.out.println(area);
        
    }
}
