package ApniCollege.Loops.patterns;

import java.util.Scanner;

public class inverted_half_pyramid {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        for (int i=n;i>0;i--) {
            for (int j=0;j<n;j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
