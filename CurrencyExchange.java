import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);
       
        // Prompt the user to input a total amount of money
        System.out.println("How much money do you want to be calculated?");
        double totalMoney = input.nextDouble();
       
        // Convert total money to cents (multiply by 100) and store it as an integer
        int remainingMoney = (int)(totalMoney * 100);
       
        // Display header for output
        System.out.println("The bills and coins needed to make " + totalMoney);
        
        // Calculate and print the number of ten-dollar bills
        System.out.print("There are ");
        int TenDollars = remainingMoney / 1000; // 1 ten-dollar bill is 1000 cents
        remainingMoney %= 1000; // Update the remaining amount after subtracting ten-dollar bills
        System.out.print(TenDollars);
        System.out.println(" Ten Dollar Bills");

        // Calculate and print the number of five-dollar bills
        System.out.print("There are ");
        int FiveDollars = remainingMoney / 500; // 1 five-dollar bill is 500 cents
        remainingMoney %= 500; // Update the remaining amount after subtracting five-dollar bills
        System.out.print(FiveDollars);
        System.out.println(" Five Dollar Bills");

        // Calculate and print the number of two-dollar bills
        System.out.print("There are ");
        int TwoDollars = remainingMoney / 200; // 1 two-dollar bill is 200 cents
        remainingMoney %= 200; // Update the remaining amount after subtracting two-dollar bills
        System.out.print(TwoDollars);
        System.out.println(" Two Dollar Bills");

        // Calculate and print the number of one-dollar bills
        System.out.print("There are ");
        int OneDollars = remainingMoney / 100; // 1 one-dollar bill is 100 cents
        remainingMoney %= 100; // Update the remaining amount after subtracting one-dollar bills
        System.out.print(OneDollars);
        System.out.println(" One Dollar Bills");

        // Calculate and print the number of quarters
        System.out.print("There are ");
        int Quarters = remainingMoney / 25; // 1 quarter is 25 cents
        remainingMoney %= 25; // Update the remaining amount after subtracting quarters
        System.out.print(Quarters);
        System.out.println(" Quarters");

        // Calculate and print the number of dimes
        System.out.print("There are ");
        int Dimes = remainingMoney / 10; // 1 dime is 10 cents
        remainingMoney %= 10; // Update the remaining amount after subtracting dimes
        System.out.print(Dimes);
        System.out.println(" Dimes");

        // Calculate and print the number of nickels
        System.out.print("There are ");
        int Nickels = remainingMoney / 5; // 1 nickel is 5 cents
        remainingMoney %= 5; // Update the remaining amount after subtracting nickels
        System.out.print(Nickels);
        System.out.println(" Nickels");

        // Calculate and print the number of pennies (cents)
        System.out.print("There are ");
        int Cents = remainingMoney / 1; // 1 cent is 1 cent
        remainingMoney %= 1; // This will always result in zero
        System.out.print(Cents);
        System.out.println(" Cents");

        System.out.println("This does not count mini cents if this variable has any value the Program has been modfied wronlgy")
        

    }
}