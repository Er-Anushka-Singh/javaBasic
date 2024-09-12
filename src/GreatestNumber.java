import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a ");
        int a = sc.nextInt();
        System.out.println("a value "+a);
        System.out.print("Enter the number b ");
        int b = sc.nextInt();
        System.out.println("b value "+b);
        System.out.print("Enter the number c ");
        int c = sc.nextInt();
        System.out.println("c value "+c);
        if (a>b && a>c){
            System.out.println("a is greatest "+a);
        }
        else if(b>a && b>c){
            System.out.println("b is grestest "+b);
        }
        else{
            System.out.println("c is greatest "+c);
        }

    }
}
