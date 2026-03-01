import java.util.Scanner;
public class w3_4lvl2_3 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int number, i;
            System.out.print("Enter a number:");
            number = sc.nextInt();
            for( i = 6; i <= 9; i++){
                System.out.println(number + " * " + i + " = " + number*i);
            }
        }
    }
}
