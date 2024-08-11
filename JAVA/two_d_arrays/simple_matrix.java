package two_d_arrays;

import java.util.Scanner;

public class simple_matrix {
    public static void main(String[] args) {
        int[][] arr=new int[2][2];
        int ele;
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 2; j++) {
             ele=in.nextInt();
             arr[i][j]=ele;
           }
        }
        in.close();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
              System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
         }
    }
}
