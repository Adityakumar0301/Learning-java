import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class addition{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        double a = sc.nextInt();
        System.out.println("enter the value of b");
        double b = sc.nextInt();

        double c = a+b;
        System.out.println(c);


    }
}