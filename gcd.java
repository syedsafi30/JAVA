import java.lang.*;
import java.util.Scanner;

public class gcd{

    static int gcd(int m, int n){

        while (m!=n){
            if (m>n){
                m= m-n;
            }
            else{
                n=n-m;
            }
        }
        return m;

    }
    public static void main(String[] args) {
        int number1,number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first digit");
        number1 = sc.nextInt();
         System.out.println("enter the second digit");
        number2 =sc.nextInt();

        int ans ;
        ans = gcd(number1, number2);

        System.out.println("the gcd of both the numbers is " +ans);
    }
}