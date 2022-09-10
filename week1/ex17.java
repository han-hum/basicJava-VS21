package week1;
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {

        int number1, number2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the first number");
        number1 = scan.nextInt();
        System.out.println("Type the second number");
        number2 = scan.nextInt();

        if (number1 > number2) {
            System.out.println("Greater number: " + number1);
        }
        else if (number2 > number1) {
            System.out.println("Greater number : " + number2);
        }
        else {
            System.out.println("The numbers are equal!");
        }
    }
}
