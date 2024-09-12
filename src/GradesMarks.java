import java.util.Scanner;

public class GradesMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the percentage ");
        float percentage = sc.nextFloat();

        if(percentage > 90){
            System.out.println(percentage+" got! grade A");
        }
        else if (percentage > 75){
            System.out.println(percentage+" got! grade B");
        }
        else if (percentage > 60){
            System.out.println(percentage+" got! grade C");
        }
        else if (percentage > 30){
            System.out.println(percentage+" got! grade D");
        }
        else  {
            System.out.println(percentage+" you are fail!");
        }

    }
}
