import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        System.out.println("Convert Fahrenheit to celsius");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number Fahrenheit ");
        float F = sc.nextFloat();
        System.out.println("F is "+F);
        float C = (F-32)*5.0f/9.0f;
        System.out.println("Celsius "+C+" Celsius");
    }
}
