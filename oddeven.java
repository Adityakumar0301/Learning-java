import java.util.Scanner;

public class oddeven {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        if (n%2 == 0) {
                            System.out.println("enen number");
                      }
        else {
               if (n==0)
               {
                   System.out.println("number is zero");
               }
               else System.out.println("odd number");
             }


    }
}
