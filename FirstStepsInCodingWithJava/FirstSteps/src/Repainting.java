import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        double nylonPricePerSquareMeter = 1.5;
        double paintPricePerLiter = 14.5;
        double thinnerPricePerLiter = 5.0;
        double additionalSquareMetersNylon = 2;
        double priceForPackages = 0.40;
        double additionalPaintPercentage = 0.1;
        double percentagePriceForWorkersPerHour = 0.3;

        Scanner scanner = new Scanner(System.in);
        int requiredNylon = Integer.parseInt(scanner.nextLine());
        int requiredPaint = Integer.parseInt(scanner.nextLine());
        int requiredThinner = Integer.parseInt(scanner.nextLine());
        int requiredWorkHours = Integer.parseInt(scanner.nextLine());

        double totalMaterialsSum = (requiredNylon + additionalSquareMetersNylon) * nylonPricePerSquareMeter
                + (requiredPaint + requiredPaint * additionalPaintPercentage) * paintPricePerLiter
                + requiredThinner * thinnerPricePerLiter
                + priceForPackages;

        double requiredMoneyForWorkers = totalMaterialsSum * percentagePriceForWorkersPerHour * requiredWorkHours;

        double totalSum = totalMaterialsSum + requiredMoneyForWorkers;

        System.out.println(totalSum);
    }
}
