import java.util.Scanner;
import java.util.ArrayList;

class Menu
{
    public static void showMenu()
    {
        System.out.println("\n menu");
        System.out.println("1. add subjects");
        System.out.println("2. add tasks");
        System.out.println("3. add due dates");
        System.out.println("4. view tasks and due date");
        System.out.println("5. exit");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> subjects = new ArrayList<>();
        ArrayList <String> tasks = new ArrayList<>();

        System.out.println("~Study Planner~");

        while (true)
        {
            Menu.showMenu();
            System.out.print("enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("enter subject name: ");
                    String subject = scanner.nextLine();
                    subjects.add(subject);
                }
                break;

                case 2: {
                    System.out.println("enter tasks to do: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                }
                break;

                case 3: {
                    System.out.println("view subjects and tasks: ");
                    System.out.println("subjects added: " + subjects);
                    System.out.println("tasks added" + tasks);

                }break;
            }
        }
    }
}
