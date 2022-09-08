package week1;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Your name is: ");
        String name = reader.nextLine();

        System.out.print("Your age: ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println("Your name is: " + name + ",and you are " + age + " years old, keen to meet ya!");
    }
}
