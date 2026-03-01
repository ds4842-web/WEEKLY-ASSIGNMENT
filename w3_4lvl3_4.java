import java.util.Scanner;
public class w3_4lvl3_1 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int number, i;
            boolean isPrime = true;
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            for(i = 2; i < number; i++){
                if( number % i == 0){
                    isPrime = false;
                    break;
                }
                
            }
            if(isPrime == false){
                System.out.println( number + " is a composite number");
            }
            else{
                System.out.println( number + " is a prime number.");
            }
        }
    }
}
