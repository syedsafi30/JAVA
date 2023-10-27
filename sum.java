import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();// number of testcases 

        for(int testcase = 1; testcase<=t ; testcase++)
        
        {
           int t2 = sc.nextInt(); // test case number 1 entered ... 

           long arr[]= new long[t2]; // arr for test case initialised

           for(int i=0; i<t2;i++){
               arr[i]= sc.nextLong();// inputs taken for after the size of array is read and all input is read for  particular test case 
           }
    // below is the operation 
           long sum =0;

           for(int i=0; i<arr.length ; i++){
               sum = sum +arr[i];
           }
           System.out.println(sum);
       }    }
}