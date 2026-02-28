import java.util.Scanner;
public class w3_4lvl1_3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int number1, number2, number3;
        boolean number1Largest = false, number2Largest, number3Largest;
        System.out.print("Enter three numbers:");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
        number1Largest = number1 > number2 && number1 > number3;
        number2Largest = number2 > number1 && number2 > number3;
        number3Largest = number3 > number1 && number3 > number2;
        System.out.println("Is the first number the largest? " + number1Largest);
        System.out.println("Is the second number the largest? " + number2Largest);
        System.out.println("Is the third number the largest? " + number3Largest);
        
        }
    }
}

