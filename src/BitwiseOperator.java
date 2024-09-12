import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number x ");
        int x  = sc.nextInt();
        System.out.print("Enter the number y ");
        int y  = sc.nextInt();
        System.out.println("BitwiseAndoperator "+(x&y));  //both  1  =1 , otherwise 0
        System.out.println("BitwiseOrOoperator "+(x|y));  // both 0 =0 ,otherwise 1
        System.out.println("BitwiseXorOperator "+(x^y));  // same value =0 ,otherwise 1
        System.out.println("BitwiseNotOperator "+(~x));  // change  o->1 , 1->0
        System.out.println("BitwiseLeftShift "+(x<<1)); // value multiply by 2
        System.out.println("BitwiseRightShift "+(x>>1));  // value divide by 2
    }
}
