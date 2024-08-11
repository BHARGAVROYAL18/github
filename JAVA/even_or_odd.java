package ApniCollege;

import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        if(n%2==0){
            System.out.println("EVEN");

        }
        else{
            System.out.println("ODD");
        }
        in.close();
    }
    
}
