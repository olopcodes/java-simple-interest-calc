import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // initiate scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Would you like to calculate your simple interest? (y/n): ");

        // get user input
        String userChoice = scanner.nextLine();

        // declare variables
        double principal, rate, time;
        int counter = 0;

        if (userChoice.equals("y")) {

            System.out.println("Lets calculate your simple interest");

            while (true) {
                // give user option to stop calculating
                if(counter >= 1) {
                    System.out.print("Do you want to stop calculating? ");

                    if(scanner.nextLine().equals("y")) break;
                }

                // get input and calculate
                System.out.print("Enter principal amount: ");
                principal = scanner.nextDouble();

                System.out.print("Enter interest rate: ");
                rate = scanner.nextDouble();

                System.out.print("Enter time period: ");
                time = scanner.nextDouble();

                // simple validate input
                if (
                  principal <= 0 ||
                  rate <= 0 ||
                  time <= 0
                ) {
                    System.out.println("Can not calculate.");
                    System.out.println("All numbers must be greater than 0");
                    break;
                }


                // (P × R × T) / 100
                double si = (principal * rate * time) / 100;
                System.out.format("Simple Interest: $%.2f", si);
                System.out.println();

                counter++;

                // clear scanner up for more inputs
                scanner.nextLine();
            }

        } else if (userChoice.equals("n")) {
            System.out.println("Ok. Maybe next time");
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();

    }
}
