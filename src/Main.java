import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~Study Planner~");

        System.out.println("\n menu");
        System.out.println("1. add subjects");
        System.out.println("2. add tasks");
        System.out.println("3. add due dates");
        System.out.println("4. view tasks and due date");
        System.out.println("5. exit");

        System.out.print("enter choice: ");
        int choice = scanner.nextInt();
        System.out.println(choice);
    }
}
