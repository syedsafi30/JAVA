import java.lang.*;
import java.util.Scanner;

public class prime {

    static int prime(int a) {
        int count = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                count = count + 1;
            }
        }

        if (count > 2) {
            return a;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        int number, ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number ");
        number = sc.nextInt();
        ans = prime(number);

        if (ans == 0)
            System.out.println("the given" + ans + "is prime number");

        else {

            System.out.println("it is not a prime number");
        }
    }
}