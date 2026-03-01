import java.util.Scanner;
public class w3_4lvl1_4 {
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        int number, sum = 0;
        System.out.print("Enter a number:");
        number = sc.nextInt();
        if (number >= 0){
            for(int i = 0; i <= number; i++){
                sum += i;

            }
            System.out.print("The sum of " + number + " natural number is " + sum);
        }
        else{
            System.out.print("The number is not a natural number");
        }
        

       }
    }
}
    

