import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String [] args){
        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter te # of times compounded per year: ");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timeCompounded, timeCompounded * years);

        //System.out.println("The amount after " + years + " is: $" + amount);

        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();
    }
}
