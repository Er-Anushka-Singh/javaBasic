import java.util.Scanner;

public class NumberEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("X is a Even number "+x);
        }
        else {
            System.out.println("X is Odd number "+x);
        }
    }
}
