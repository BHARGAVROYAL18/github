package Loops.patterns;

import java.util.Scanner;

public class inverted_half_pyramid2 {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i-1)*2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
            
        } 
    }
}



