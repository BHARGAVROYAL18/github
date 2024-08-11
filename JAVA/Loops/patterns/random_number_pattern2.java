package Loops.patterns;

import java.util.Scanner;

/*
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */
public class random_number_pattern2 {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     in.close();
     for (int i = 0; i < n; i++) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print(j);
        }
        System.out.println(" ");
     }
    }
}
