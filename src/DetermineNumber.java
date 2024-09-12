import java.util.Scanner;

public class DetermineNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int x = sc.nextInt();
        System.out.println("X value "+x);
        if(x==0){
            System.out.println("X is zero number "+x);
        }
        else if (x<0){
            System.out.println("X is negtive number "+x);
        }
        else {
            System.out.println("X is postive number "+x);
        }
    }
}
