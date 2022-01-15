import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        final Set<String> dictionary = new HashSet<>();
        final Set<String> words = new HashSet<>();
        final Scanner scanner = new Scanner(System.in);
        int d = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < d; i++) {
            dictionary.add(scanner.nextLine().strip().toLowerCase());
        }
        int l = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < l; i++) {
            words.addAll(List.of(scanner.nextLine().strip().toLowerCase().split("\\s+")));
        }
        words.removeAll(dictionary);
        words.forEach(System.out::println);
    }
}