import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ticket discount calculator");
        System.out.print("Enter your age ");
        int age = sc.nextInt();
        System.out.println("Age is "+age);
        System.out.print("Are you a female ? (true/false) ");
        boolean isFemale = sc.nextBoolean();
        if(age<5){
            System.out.println("you got 75% discount");
        }
        else if(isFemale){
            System.out.println(" you got 50% discount");
        }
        else if (age>60 && !isFemale){
            System.out.println("you got 25% discount");
        }
        else {
            System.out.println("you got no discount");
        }
    }
}
