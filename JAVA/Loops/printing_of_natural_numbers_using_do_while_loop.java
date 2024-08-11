package Loops;

import java.util.Scanner;

public class printing_of_natural_numbers_using_do_while_loop {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
        in.close();
    }
}
