package Loops;
import java.util.Scanner;
public class printing_of_natural_numbers {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 0; i <=n; i++) {
            System.out.println(i);
        }
        in.close();
    }
    
}
