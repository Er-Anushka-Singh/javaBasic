import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age ");
        int age = sc.nextInt();

        if (age >60){
            System.out.println(age+" you are senior citizen");
        }
        else if(age >20){
            System.out.println(age+" you are Adult citizen");
        }
        else if(age >13){
            System.out.println(age+" you are teenager");
        }
        else{
            System.out.println(age+" you are child");
        }
    }
}
