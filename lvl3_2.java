import java.util.Scanner;
public class lvl3_2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int fahrenheit;
        double celsius;
        System.out.print("Enter the temperature in fahrenheit: ");
        fahrenheit = sc.nextInt();
        celsius = (fahrenheit - 32) * (double)5/9;
        System.out.print("The " + fahrenheit + " fahrenheit is " + celsius + " celsius ");
        }
    }
}
