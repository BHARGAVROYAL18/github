package ApniCollege.Loops;

import java.util.Scanner;

public class table_of_given_number {
    public static void main(String[] args) {
           Scanner in =new Scanner(System.in);
           int n=in.nextInt();
           for (int i = 1; i <=10; i++) {
            System.out.println(n +" * "+ i +" = "+ n*i);
        }
        in.close();
    }
}
