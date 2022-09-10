package week1;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {

        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number: ");
        number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }
        else {
            System.out.println(number + " is odd");
        }
    }
}
