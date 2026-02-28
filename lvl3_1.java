import java.util.Scanner;
public class lvl3_1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int celsius;
        double fahrenheit;
        System.out.print("Enter the temperature in celsius: ");
        celsius = sc.nextInt();
        fahrenheit = (celsius *(double)9/5) + 32;
        System.out.print("The " + celsius + " celsius is " + fahrenheit + " fahrenheit ");
        }
    }
    
}
