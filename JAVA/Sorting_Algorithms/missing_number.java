package Sorting_Algorithms;
//0 to n
public class missing_number {
    public static void main(String[] args) {
        int[ ] arr={9,6,4,2,3,5,7,0,1};
        missingNumber( arr);
      
        
        
    }
    public  static void  missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            if(arr[i]<arr.length){
                if(arr[i]!=i){
                    int temp=arr[i];
                    arr[i]=arr[arr[i]];
                    arr[temp]=temp;
                }
                else{
                    i++;
                }
            }
            else{
                System.out.println(arr[i]-1);
                break;
            }
        }
    }
}
