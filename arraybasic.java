import java.util.Arrays;
import java.util.Scanner;

public class arraybasic {
    static void main(String[] args) {

          Scanner in = new Scanner(System.in);

        int [] rollno = new int[5];
        int[] rno2 = {10,12,14,16,22};

        System.out.println(rno2);


          int[] arr = new int[5];
     arr[0]=23;
        arr[1]=24;
        arr[1]=25;


        arr[3]=26;
        arr[4]=27;


        for (int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
//
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 50; i++) {
            System.out.println(arr[i] + " ") ;
       }

        for (int num:arr){
            System.out.println(num+" ");
        }


        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
//
        System.out.println(Arrays.toString(str));

          int[] num = {1, 2, 3, 4,};

          int[] num2 = num;
          num2[3] = 22;
        System.out.println(num2[3]);

    }
}
