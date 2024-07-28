package ApniCollege.Loops.patterns;

import java.util.Scanner;

public class hollow_rectangle{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int breadth=in.nextInt();
        int length=in.nextInt();
        
        in.close();
        for (int i = 1; i <= breadth; i++) {
            for (int j = 1; j <= length; j++) {
                if(i==1 || j==1 || i==breadth || j==length ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
