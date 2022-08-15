import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        double pricePerSquareMeter = 7.61;
        Scanner scanner = new Scanner(System.in);
        double inputArea = Double.parseDouble(scanner.nextLine());
        double totalPrice = pricePerSquareMeter * inputArea;
        double discount = totalPrice * 0.18;

        System.out.println(String.format("The final price is: %.2f lv.", totalPrice - discount));
        System.out.println(String.format("The discount is: %.2f lv.", discount));
    }
}