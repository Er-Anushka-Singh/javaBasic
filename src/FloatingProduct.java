import java.util.Scanner;

public class FloatingProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number x ");
        float x = sc.nextFloat();
        System.out.println("x is "+x);
        System.out.print("Enter the number y ");
        float y = sc.nextFloat();
        System.out.println("y is "+y);
        System.out.println("Product of floating number "+(x*y));
    }
}
