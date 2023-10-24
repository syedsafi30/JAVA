import java.lang.*;
import java.util.Scanner;

class Area {
    public static void main(String[] args) {
       float base;
       float height; 
       float area; 
       System.out.println("please enter base ");
        Scanner inp1 = new Scanner(System.in);
        base = inp1.nextFloat();
        System.out.println("please enter height");
        Scanner inp2 = new Scanner(System.in);
        height = inp1.nextFloat();
        area = (0.5f)*(base*height);
        System.out.printf("Area of the triangle is %.2f%n", area);

    }
}