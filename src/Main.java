import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome to in our code "+name);
        System.out.print(name+" also tell me you age");
        int age = sc.nextInt();
        System.out.println(name+" age is "+age);
    }
}