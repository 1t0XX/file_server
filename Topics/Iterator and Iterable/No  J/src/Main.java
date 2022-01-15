import java.util.*;

public class Main {

    public static void processIterator(String[] array) {
        // write your code here
        List<String> list = new ArrayList<>(List.of(array));
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String current = listIterator.next();
            if (current.charAt(0) != 'J') {
                listIterator.remove();
            } else {
                listIterator.set(current.substring(1));
            }
        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}