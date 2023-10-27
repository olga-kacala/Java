import java.util.Scanner;

public class Scratch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        scanner.close();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
