import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number A ");
        int A = sc.nextInt();
        System.out.println("A is "+A);
        System.out.print("Enter the number B ");
        int B = sc.nextInt();
        System.out.println("B is "+B);
        System.out.print("Enter the number C ");
        int C = sc.nextInt();
        System.out.println("C is "+C);
        int sum = A+B+C;
        System.out.println("Perimeter of rectangle "+sum);

    }
}
