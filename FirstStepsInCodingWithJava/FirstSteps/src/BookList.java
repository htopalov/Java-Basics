import java.util.Scanner;

public class BookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bookPages = Integer.parseInt(scanner.nextLine());
        int readPagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToRead = Integer.parseInt(scanner.nextLine());

        int totalTimeToRead = bookPages / readPagesPerHour;
        int requiredHours = totalTimeToRead / daysToRead;

        System.out.println(requiredHours);
    }
}
