import java.util.Scanner;

public class CafeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to AD Cafe!");
        System.out.println("Menu: Coffee - 200, Tea - 150, Sandwich - 300");

        System.out.print("Enter number of Coffees: ");
        int coffee = scanner.nextInt();
        System.out.print("Enter number of Teas: ");
        int tea = scanner.nextInt();
        System.out.print("Enter number of Sandwiches: ");
        int sandwich = scanner.nextInt();

        int total = coffee * 200 + tea * 150 + sandwich * 300;
        System.out.println("Total bill: " + total + " LKR");

        scanner.close();
    }
}
