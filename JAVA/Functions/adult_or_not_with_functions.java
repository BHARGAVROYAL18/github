package ApniCollege.Functions;


import java.util.Scanner;


public class adult_or_not_with_functions {

    public static void main(String[] args) {
        int age;
        Scanner in=new Scanner(System.in);
        age=in.nextInt();
        adult_or_not(age);
        in.close();
    }
    public static void adult_or_not(int age){
        if(age>=18){
            System.out.println("ADULT");
        }
        else{
            System.out.println("NOT AN ADULT");
        }
        
    }

}