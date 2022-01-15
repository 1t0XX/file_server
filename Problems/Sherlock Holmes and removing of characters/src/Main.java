import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine().strip().toLowerCase();
        String secondWord = scanner.nextLine().strip().toLowerCase();

        Map<Character, Integer> firstWordMap = getWordMap(firstWord);
        Map<Character, Integer> secondWordMap = getWordMap(secondWord);

        Set<Character> tempSet = new HashSet<>(firstWordMap.keySet());
        tempSet.addAll(secondWordMap.keySet());
        int sum = 0;
        for (char ch : tempSet) {
            int first = firstWordMap.getOrDefault(ch, 0);
            int second = secondWordMap.getOrDefault(ch, 0);
            sum += Math.abs(first - second);

        }

        System.out.println(sum);
    }

    private static Map<Character, Integer> getWordMap(String word) {
        Map<Character, Integer> wordMap = new HashMap<>();
        for (char ch : word.toCharArray()) {
            wordMap.put(ch, wordMap.getOrDefault(ch, 0) + 1);
        }
        return wordMap;
    }
}