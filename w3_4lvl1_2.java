import java.util.Scanner;
public class w3_4lvl1_2 {
    public static void main(String[] args) {
        int number1,number2, number3;
        String smallestNumber;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter three numbers:");
            number1 = sc.nextInt();
            number2 = sc.nextInt();
            number3 = sc.nextInt();
            if(number1 < number2 && number1 < number3){
                smallestNumber = "yes";
            }
            else{
                smallestNumber = "no";
            }
            System.out.println("Is the first number the smallest? " + smallestNumber);
            }
        }   
}
    

