package week1;
import java.util.Scanner;

public class ex15N {
    public static void main(String[] args) {

        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        age = scan.nextInt();

        if (age < 18) {
            System.out.println("You have not reached the age of majority yet!");
        }
        if (age > 18) {
            System.out.println("You have reached the age of majority!");
        }
    }
}