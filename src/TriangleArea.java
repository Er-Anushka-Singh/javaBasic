import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number Breath ");
        int B = sc.nextInt();
        System.out.println("B is "+B);
        System.out.print("Enter the number Height ");
        int H = sc.nextInt();
        System.out.println("H is "+H);
        int area = ((B*H)*1/2);
        System.out.println("Area of triangle "+(area));
    }
}
