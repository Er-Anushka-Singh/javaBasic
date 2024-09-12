import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Welocme "+name+" to beginner java code");
        System.out.print("Enter the two number :");
        int a = sc.nextInt();
        System.out.println("first number "+a);
        int b = sc.nextInt();
        System.out.println("second number "+b);
        int sum = a+b;
        System.out.println("Add of two number "+sum);


    }
}
