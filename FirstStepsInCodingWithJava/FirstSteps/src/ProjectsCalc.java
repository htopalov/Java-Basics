import java.util.Scanner;

public class ProjectsCalc {
    public static void main(String[] args) {
        int hoursPerProject = 3;
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                name, projectsCount*hoursPerProject,projectsCount);
    }
}
