import java.util.Scanner;
public class lvl2_4 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        double feet, mileConversion, yardConversion; 
        System.out.print("Enter the distance in feet: ");   
        feet = sc.nextDouble();
        mileConversion = feet / 5280;
        yardConversion = feet / 3;
        System.out.print("The distance in yards is " + yardConversion + " while the distance in miles is " + mileConversion);

        }
    }
    
}
