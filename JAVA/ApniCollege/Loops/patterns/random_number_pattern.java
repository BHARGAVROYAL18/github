package ApniCollege.Loops.patterns;

import java.util.Scanner;

/* 1
 * 12
 * 123
 * 1234
 * 12345
 */
public class random_number_pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
