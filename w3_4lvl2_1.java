import java.util.Scanner;
public class w3_4lvl2_1 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int number, i;
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            for (i = 1; i <= number; i++){
                if (i % 2 == 0){
                    System.out.println(i + " is even");
                }
                else{
                    System.out.println(i + " is odd");
                }
            }

        }
    }
}
