import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        int catFoodPrice = 4;
        double dogFoodPrice = 2.5;

        Scanner scanner = new Scanner(System.in);
        int dogFoodCount = Integer.parseInt(scanner.nextLine());
        int catFoodCount = Integer.parseInt(scanner.nextLine());
        double totalSum = dogFoodCount * dogFoodPrice + catFoodCount * catFoodPrice;

        System.out.printf("%.1f lv.", totalSum);
    }
}
