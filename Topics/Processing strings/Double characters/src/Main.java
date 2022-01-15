import java.util.Scanner;

class Alphabetical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letters = scanner.next();
        boolean ordered = true;

        for (int i = 0; i < (letters.length()-1); i++){
            char ch = letters.charAt(i);
            char nextCh = letters.charAt(i+1);
            if (ch <= nextCh){
                continue;
            } else {
                ordered = false;
            }
        }
        System.out.println(ordered);
    }
}
