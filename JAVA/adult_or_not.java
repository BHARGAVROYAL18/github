package ApniCollege;


import java.util.Scanner;


public class adult_or_not {

    public static void main(String[] args) {
        int age;
        Scanner in=new Scanner(System.in);
        age=in.nextInt();
        if(age>=18){
            System.out.println("ADULT");
        }
        else{
            System.out.println("NOT AN ADULT");
        }
        in.close();
    }

}