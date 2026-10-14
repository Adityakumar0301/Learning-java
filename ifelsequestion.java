//In this challenge, we test your knowledge of using if-else conditional 
// statements to automate decision-making processes.
//  An if-else statement has the following logical flow:


// Task
// Given an integer,n, perform the following conditional actions:

// If n is odd, print Weird
// If n is even and in the inclusive range of 2 to 5,print Not Weird
// If n is even and in the inclusive range of 6 to 20, print Weird
// If n is even and greater than 20, print Not Weird
// Complete the stub code provided in your editor to print whether or not  is weird.

import java.util.Scanner;

public class ifelsequestion {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.print("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.print("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.print("Weird");
            } else {
                System.out.print("Not Weird");
            }
        }

        sc.close();
    }
}
