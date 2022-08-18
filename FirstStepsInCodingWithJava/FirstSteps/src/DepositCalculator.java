import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int depositTime = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double interest = deposit * interestRate / 100;
        double interestPerMonth = interest / 12;
        double totalSum = deposit + depositTime * interestPerMonth;

        System.out.println(totalSum);
    }
}
