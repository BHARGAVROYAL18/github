package ApniCollege.Loops;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int   n=in.nextInt();
        int flag=0;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
               flag++;

            }
        }
        if(flag==0){
            System.out.println("PRIME NUMBER");
        }
        else{
            System.out.println("COMPOSITE NUMBER");
        }




        in.close();
    }
    
}
