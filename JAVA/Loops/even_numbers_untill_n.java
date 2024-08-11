package ApniCollege.Loops;
import java.util.Scanner;
public class even_numbers_untill_n {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 0; i <=n; i=i+2) {
            System.out.println(i);
        }
        in.close();
    }
    
}
