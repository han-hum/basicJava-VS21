package week1;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());

        System.out.println("Circumference of the circle: " + (2 * Math.PI * radius));
    }
}
