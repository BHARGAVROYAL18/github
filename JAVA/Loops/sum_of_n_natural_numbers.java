package Loops;

import java.util.Scanner;

public class sum_of_n_natural_numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum=sum+i;
            
        }
        System.out.println(sum);
        in.close();
    }
}
