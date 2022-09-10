package week1;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number: ");
        number = scan.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        }
        if (number < 0) {
            System.out.println("The number is not positive.");
        }
    }
}
