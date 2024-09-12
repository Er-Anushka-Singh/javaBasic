import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number Principle ");
        int P = sc.nextInt();
        System.out.println("P is "+P);
        System.out.print("Enter the number Rate ");
        float R = sc.nextFloat();
        System.out.println("R is "+R);
        System.out.print("Enter the number Time ");
        float T = sc.nextFloat();
        System.out.println("T is "+T);
        float SI =(P*R*T)/100;
        System.out.println("Simple interest "+SI);
    }
}
