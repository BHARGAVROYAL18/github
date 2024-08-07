package ApniCollege.arrays;

import java.util.Scanner;

public class searching_an_element_in_an_array{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter an element to search ");
        int ele=in.nextInt();
        for (int i = 0; i < size; i++) {
            if(arr[i]==ele){
                System.out.println("Element found at "+i+" index");
            }
        }
        in.close();
        
    }
}
