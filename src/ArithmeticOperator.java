import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number x ");
        int x = sc.nextInt();
        System.out.println("x is "+x);
        System.out.print("Enter the number y ");
        int y = sc.nextInt();
        System.out.println("y is "+y);
        System.out.println("Addition "+(x+y));
        System.out.println("Substraction "+(x-y));
        System.out.println("Multiplication "+(x*y));
        System.out.println("Division "+(x/y));
        System.out.println("Reminder "+(x%y));
    }
}
