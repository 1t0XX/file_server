import java.util.*;

class SimpleDateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dateInput = scanner.nextLine().split("-");
        int dayMax = 31;
        int monthMax = 12;
        int year = Integer.valueOf(dateInput[0]);
        int month = Integer.valueOf(dateInput[1]);
        int day = Integer.valueOf(dateInput[2]);

        if (year <= 0 || month <= 0 || month > monthMax || day <= 0 || day > dayMax){
            System.out.println("Incorrect input");
        } else {
            String dateUs = String.format("%s/%s/%s", dateInput[1], dateInput[2], dateInput[0]);
            System.out.println(dateUs);
        }
    }
}
