package codsoft;

import java.util.Scanner;

class grades{
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter number of subjects students have");
       int subjects=in.nextInt();
       int[] arr=new int[subjects];
       for (int i = 0; i < arr.length; i++) {
        System.out.println("Enter marks of subject "+(i+1));
        arr[i]=in.nextInt();
       }
       int sum=0;
       for (int i = 0; i < arr.length; i++) {
        sum=sum+arr[i];

       }
       int average=(sum/subjects)*100;
       if(average>=90){
        System.out.println("GRADE A");
       }
       else if(average>=80 && average<=70){

       }



       in.close();
    }
}