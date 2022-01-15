import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Map<String, Integer> word1 = letterCount(scanner.nextLine().toLowerCase());
        Map<String, Integer> word2 = letterCount(scanner.nextLine().toLowerCase());

        System.out.println(Objects.equals(word1, word2) ? "yes" : "no");
    }

    public static SortedMap<String, Integer> letterCount(String string) {
        SortedMap<String, Integer> letterCount = new TreeMap<>();
        List<String> letters = List.of(string.strip().split(""));

        for (String letter : letters) {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
        }

        return letterCount;
    }

}