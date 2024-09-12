import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age ");
        int age = sc.nextInt();
        System.out.println("Your age is "+age);
        if(age>=18){
            System.out.println("You are eligible of driving licance");
        }
        else {
            System.out.println("No ,Right now! You are child");
        }
    }
}
