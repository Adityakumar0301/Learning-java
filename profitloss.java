import java.util.Scanner;

public class profitloss {
    private static int math;

    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        System.out.println("enter the valuye of sellingprize");
        double sellingprize = sc.nextInt();

        System.out.println("enter the value of costprize");
        double costprize = sc.nextInt();


        double c= (sellingprize -costprize);

        if (c==0)
        {
            System.out.println("no profit or loss " + c);
        }

        else
        {
            if(c<0)

            {
                double d =-(c);
                System.out.println("seller made lost of " +d);
            }

            else
            {
                System.out.println("seller made profit of " +c);
            }
        }


    }
}