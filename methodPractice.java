import java.lang.*;
import java.util.Scanner;

public class methodPractice{

    static int max(int x, int y){
        if (x>y)
        {
            return x;
        }
        else{
            return y; 
        }
    }
    public static void main(String[] args) {
         int a=10,b=25,c;
      methodPractice mp = new methodPractice();
      System.out.println(mp.max(a, b));
    }
}