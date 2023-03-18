import java.util.*;


class Main{
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of array");

        int Count =0;
        int MaxCount = 0 ;
        int MaxNum = 0;

        int Size = in.nextInt();
        int[] Num = new int[Size];

        for (int i =0; i< Size ; i++){
            System.out.println("Element Number "+ i + " : ");
            Num[i] = in.nextInt();
        }


        for (int i = 0 ; i < Size ; i++){
            for (int j = i+1 ; j < Size ; j++){
                if (Num[i] == Num[j]){
                    Count ++ ;
                }
            }
            if (Count >= MaxCount){
                MaxCount = Count ;
                MaxNum = Num[i];
            }
            Count = 0;
        }

        System.out.println("Most Number repeated is : " + MaxNum);


    }


}