import java.util.Scanner;

public class EvenOddBitwiseOperator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Verfing the number even odd by bitwise operator ");
        System.out.print("Enter the number ");
        int x = sc.nextInt();

        if((x&1)==1){
            System.out.println("Number is odd "+x);
        }
        else{
            System.out.println("Number is even "+x);
        }
    }
}
