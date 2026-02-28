import java.util.Scanner;
public class lvl2_1 {
    public static void main(String[] args){
       try(Scanner sc = new Scanner(System.in)){
       int number1, number2, addition, subtraction, multiplication;
       double division;
       System.out.println("Enter two numbers:");
       number1 = sc.nextInt();
       number2 = sc.nextInt();
       addition = number1 + number2;
       subtraction = number1 - number2;
       multiplication = number1 * number2;
       division = (double)number1 / number2;
       System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + " and " + division);
       }
    }
    
}
