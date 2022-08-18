import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        double penPackagePrice = 5.8;
        double markerPackagePrice = 7.2;
        double cleanerPricePerLitre = 1.2;

        Scanner scanner = new Scanner(System.in);
        int penPackagesCount = Integer.parseInt(scanner.nextLine());
        int markerPackagesCount = Integer.parseInt(scanner.nextLine());
        int cleanerLitres = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double totalPrice = penPackagesCount * penPackagePrice + markerPackagesCount * markerPackagePrice
                + cleanerLitres * cleanerPricePerLitre;

        double discountedPrice = totalPrice - (totalPrice * discount / 100);

        System.out.println(discountedPrice);
    }
}
