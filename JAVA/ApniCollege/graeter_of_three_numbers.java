package ApniCollege;

import java.util.Scanner;
public class graeter_of_three_numbers {
    

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a>b && a>c){
            System.out.println("A is Greater");
        }
        else if(b>a && b>c){
            System.out.println("B is Greater");
        }
        else{
            System.out.println("C is Greater");
        }
        in.close();
       }
    
}
