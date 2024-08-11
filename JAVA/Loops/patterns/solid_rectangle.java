package ApniCollege.Loops.patterns;

import java.util.Scanner;

public class solid_rectangle{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int length=in.nextInt();
        int breadth=in.nextInt();
        in.close();
        for (int i = 0; i < breadth; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
