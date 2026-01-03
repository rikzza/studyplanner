import java.util.Scanner;
import java.util.ArrayList;

class Menu
{
    public static void showMenu()
    {
        System.out.println("\n Menu");
        System.out.println("1. Add subjects");
        System.out.println("2. Add tasks");
        System.out.println("3. View subjects and tasks");
        System.out.println("4. Exit");
    }
}

public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> subjects = new ArrayList<>();
        ArrayList <String> tasks = new ArrayList<>();
        ArrayList <String> dueDates = new ArrayList<>();

        System.out.println("\n~Study Planner~");

        while (true)
        {
            Menu.showMenu();
            System.out.print("enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                {
                    while(true)
                    {
                        System.out.println("enter subject (enter 0 to stop): ");
                        String subject = scanner.nextLine();

                        if (subject.equals("0"))
                        {
                            System.out.println("done!");
                            break;
                        }
                        subjects.add(subject);
                    }
                }
                break;

                case 2:
                {
                    while(true)
                    {
                        System.out.println("enter tasks to do (enter 0 to stop): ");
                        String task = scanner.nextLine();

                        if(task.equals("0"))
                        {
                            System.out.println("done!");
                            break;
                        }

                        System.out.println("due date for task? ");
                        String dueDate = scanner.nextLine();

                        tasks.add(task);
                        dueDates.add(dueDate);
                    }
                }
                break;

                case 3:
                {
                    System.out.println("view subjects and tasks: ");

                    System.out.println("subjects added: ");
                    if (subjects.isEmpty())
                    {
                        System.out.println("none");
                    }
                    else
                    {
                        for (int i = 0; i<subjects.size(); i++) {
                            System.out.println((i + 1) + ". " + subjects.get(i));
                        }
                    }

                    System.out.println("tasks and their due dates: ");
                    if (tasks.isEmpty())
                    {
                        System.out.println("none");
                    }
                    else
                    {
                        for (int i = 0; i<tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i) + " (Due: " + dueDates.get(i) +" )");
                        }
                    }
                }
                break;

                case 4:
                {
                    System.out.println("exiting program...");
                    return;
                }

                default:
                {
                    System.out.println("Wrong choice. Try again");
                }
            }
        }
    }
}
