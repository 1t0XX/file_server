import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] letters = scanner.next().split("");
        scanner.close();
        int insertionsNeeded = 0;
        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            count++;
            if (i == letters.length - 1 || "aeiouy".contains(letters[i]) != "aeiouy".contains(letters[i + 1])) {
                insertionsNeeded += (count - 1) / 2;
                count = 0;
            }
        }
        System.out.println(insertionsNeeded);
    }
}