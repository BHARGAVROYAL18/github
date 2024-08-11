package ApniCollege.Functions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a;
        a=in.nextInt();
        
        System.out.println("Factorial of "+a +" is "+  factori(a));
        in.close();
    }
    public static int factori(int a){
        int fact=1;
        for (int i = 2; i <= a; i++) {
            fact=fact*i;
        }
        return fact;
    }
}
