package ApniCollege.Functions;

import java.util.Scanner;

public class product_of_two_numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Product = "+  product(a,b));
        in.close();
    }
    public static int product(int a,int b){
        return a*b;
    }
}
