import java.util.Scanner;
public class w3_4lvl2_2{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int salary, yearWorked;
            double bonusAmount = 0.0;
            System.out.print("Enter your current salary: ");
            salary = sc.nextInt();
            System.out.print("Enter number of years worked: ");
            yearWorked = sc.nextInt();
            if (yearWorked > 5){
                bonusAmount = salary * (double) 5 / 100;
                System.out.println("The bonus amount is " + bonusAmount);
            }
            else{
                System.out.println("The bonus amount is " + bonusAmount);
            }
            
        }
    }
}