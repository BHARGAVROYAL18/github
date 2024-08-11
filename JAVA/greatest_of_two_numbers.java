
import java.util.Scanner;

public class greatest_of_two_numbers {
   public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int a,b;
    a=in.nextInt();
    b=in.nextInt();
    if(a>b){
        System.out.println("A is Greater");
    }
    else{
        System.out.println("B is Greater");
    }
    in.close();
   }

}
