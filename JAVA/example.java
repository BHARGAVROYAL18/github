

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int button=in.nextInt();
        switch (button){
          case 1:
             System.out.println("Hello");
             break;
          case 2:
             System.out.println("Namaste");
             break;
          case 3:
             System.out.println("Bounjour");
             break;
          default:
             System.out.println("Enter a valid number");
        }
        in.close();
    }
}
