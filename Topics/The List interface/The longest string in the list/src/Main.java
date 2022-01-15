import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        // write your code here
        int maxSize = 0;
        String world = "";
        for (String string : list) {
            if (string.length() > maxSize) {
                maxSize = string.length();
                world = string;
            }
        }
        Collections.fill(list, world);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}