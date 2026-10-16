import java.util.Arrays;

public class array1 {
    static void main(String[] args) {
        int[] arr= {1 , 2 , 3, 4, 5, 6, 7,};

        System.out.println(arr.length);
//        Arrays.fill(arr,10);
//        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr,1,4,10);

        //it will not include starting point but will include end point

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
