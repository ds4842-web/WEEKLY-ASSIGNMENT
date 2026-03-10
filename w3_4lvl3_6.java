//Code to find number of digits in a given number
import java.util.Scanner;
public class w3_4lvl3_6 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int number, count = 0;
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            while(number != 0){
                number /= 10;
                count++;
            }
            System.out.println("Number of digits is " + count);


        }
    }
    
}
