package Sorting_Algorithms;

import java.util.Scanner;

public class bubbble_sort {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int[] arr=new int[n];
        
        int temp;
        System.out.println("Enetr array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
          
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n-1; i++) {
                if(arr[i]>arr[i+1]){
                    
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            
            
        }
        System.out.println("The Array Elements after Sorting are ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
    
}
