package Sorting_Algorithms;

public class cyclic_sort {
    public static void main(String[] args) {
        //1 to n
        //index=value-1
        int[ ] arr={3,5,4,2,1};
        
      
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int temp=arr[i];
                arr[i]=arr[arr[i]-1];
                arr[temp-1]=temp;
            }
            else{
                i++;
            }
        }
        for ( i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
