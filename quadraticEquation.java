import java.lang.*;
import java.util.Scanner;

class quadraticEquation {
    public static void main(String[] args) {
        int a,b,c;
        double r1,r2;

        Scanner inp1 = new Scanner(System.in);
        System.out.println( " enter the first expression");
        a = inp1.nextInt();
         Scanner inp2 = new Scanner(System.in);
        System.out.println( " enter the second expression");
        b = inp2.nextInt();
         Scanner inp3 = new Scanner(System.in);
        System.out.println( " enter the third expression");
        c = inp3.nextInt();

        r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
          r2 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("roots are "+r1+" "+r2);
    }
}



