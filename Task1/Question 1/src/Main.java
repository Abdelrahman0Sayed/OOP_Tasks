import java.util.*;

public class Main {
    public static void Pattern1(int n){

        for (int i = 1 ; i < n ; i++){
            System.out.print(" ");
            for (int j = 0 ; j < n-i ; j++){
                System.out.print(" ");
            }
            for (int j = n-i ; j < n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void Pattern2 (int n ){
        for (int i = 1 ; i <= n ; i++) {
            for (int j = n - i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0 ; j <= n -i  ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main (String[] Args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int NumberOfRows = in.nextInt();
        Pattern1(NumberOfRows);
        Pattern2(NumberOfRows);
    }
}