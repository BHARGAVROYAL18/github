

import java.util.Scanner;

public class Calculator {


public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter Two numbers");
    int  a=in.nextInt();
    int  b=in.nextInt();
    System.out.println("Enter operation to perform\n1-> addition\n2->subraction\n3->multiplication\n4->dividion\n5->modulus");
    int choice = in.nextInt();
    switch(choice){
        case 1:
          
         
          int sum=a+b;
          System.out.println(sum);
          break;
        case 2:
        int sub=a-b;
        System.out.println(sub);
        break;
        case 3:
        int mul=a*b;
        System.out.println(mul);
        break;
        case 4:
        int div=a/b;
        System.out.println(div);
        break;
        case 5:
        int mod=a%b;
        System.out.println(mod);
        break;
        default:
        System.out.println("Enter a valid Input");

           
    }
    in.close();
   }
    
}
