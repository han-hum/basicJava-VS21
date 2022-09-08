package week1;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number: \n");

        int secondNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the numbers: " + (firstNumber + secondNumber));
    }
}
