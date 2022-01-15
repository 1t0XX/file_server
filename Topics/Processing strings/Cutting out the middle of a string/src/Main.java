import java.util.*;

class MiddleOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String start;
        String end = word.substring(word.length()/2+1);
        if(word.length() % 2 == 0){
            start = word.substring(0, word.length() / 2 - 1);
        } else {
            start = word.substring(0, word.length() / 2);
        }
        word = start.concat(end);
        System.out.println(word);
    }
}