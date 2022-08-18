import java.util.Scanner;

public class USDToBGNConvertor {
    public static void main(String[] args) {
        double convertionRate = 1.79549;
        Scanner scanner = new Scanner(System.in);
        double usdInput = Double.parseDouble(scanner.nextLine());
        double bgn = usdInput * convertionRate;
        System.out.println(bgn);
    }
}
