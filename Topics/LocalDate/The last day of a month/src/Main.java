import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("\\s+");
        int year = Integer.parseInt(line[0]);
        int day = Integer.parseInt(line[1]);

        System.out.println(isLastDayOfTheMonth(year, day));
    }

    public static boolean isLastDayOfTheMonth(int year, int day) {
        LocalDate date = LocalDate.ofYearDay(year, day);
        return date.plusDays(1).getDayOfMonth() == 1;
    }
}