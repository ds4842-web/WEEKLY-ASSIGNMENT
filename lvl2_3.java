import java.util.Scanner;
public class lvl2_3 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int perimeter, side;
            System.out.print("Enter the perimeter of the square: ");
            perimeter = sc.nextInt();
            side = perimeter / 4;
            System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        }
    }
}
