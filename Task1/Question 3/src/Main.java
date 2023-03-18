import java.util.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);

        //Take Size of Array from user
        System.out.println("Enter the Size of Array");
        int Size = in.nextInt();
        int[] Num = new int[Size];

        //Enter Elements of this array
        for (int i = 0 ; i< Size ; i++){
            System.out.println("Element number "+ i + " : ");
            Num[i] = in.nextInt();
        }

        //Sorting our Array to make the last element is the bigger so The number before it is considered Second largest element
        Arrays.sort(Num);
        System.out.println("Second Largest Element = " + Num[Size -2 ]);


    }
}