package ApniCollege;
import java.util.Scanner;
public class months_of_a_calender {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enetr a number to print its corresponding month");
        int n=in.nextInt();
        switch(n){
            case 1:
            System.out.println("JAUNARY");
            break;
            case 2:
            System.out.println("FEBRAUARY");
            break;
            case 3:
            System.out.println("MARCH");
            break;
            case 4:
            System.out.println("APRIL");
            break;
            case 5:
            System.out.println("MAY");
            break;
            case 6:
            System.out.println("JUNE");
            break;
            case 7:
            System.out.println("JULY");
            break;
            case 8:
            System.out.println("AUGUST");
            break;
            case 9:
            System.out.println("SEPTEMBER");
            break;
            case 10:
            System.out.println("OCTOBER");
            break;
            case 11:
            System.out.println("NOVEMBER");
            break;
            case 12:
            System.out.println("DECEMBER");
            break;
            default:
            System.out.println("Enter a valid number");
        }
        in.close();

    }
}
