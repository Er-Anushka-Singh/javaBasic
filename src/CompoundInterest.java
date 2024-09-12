import java.util.Scanner;

public class CompoundInterest {
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
        double CI = P * Math.pow((1+R/100),T);
        System.out.println("Compound interest "+CI);
    }
}
