import java.util.Scanner;
public class w3_4lvl1_1 {
    public static void main(String[] args) {
        int number;
        String answer;
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter a number:");
        number = sc.nextInt();
        if(number % 5 == 0){
            answer = "Yes";
        } else {
            answer = "No";
        }
        System.out.println("Is the number "+ number + "divisible by 5? " + answer);
        }
    }
}

