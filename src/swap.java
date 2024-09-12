import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("before swapping");
        System.out.print("Enter the number x : " );
        int x = sc.nextInt();
        System.out.println("x is "+x);
        System.out.print("Enter the number y : ");
        int y = sc.nextInt();
        System.out.println("y is "+y);
        int z=x;
        x=y;
        y=z;
        System.out.println("After swapping");
        System.out.println("x is "+x);
        System.out.println("y is "+y);




    }
}
