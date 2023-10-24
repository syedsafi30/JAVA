import java.lang.*;
import java.util.Scanner;

public class maxElement {


    static int max(int arr1[]){

        int max = arr1[0];
        for (int i=0; i<arr1.length; i++){
            if(arr1[i]>max)
            max=arr1[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int size, ans;
        Scanner sc = new Scanner(System.in) ;
         System.out.println(" enter the size for the array");
        size = sc.nextInt();
        int [] arr = new int [size];

        System.out.println(" enter the elements for the array");

        for ( int i =0; i< size; i++){
            arr[i]= sc.nextInt();
        }

       ans = max(arr);
       System.out.println("the maximum number from the array is "+ ans); 
    }
}