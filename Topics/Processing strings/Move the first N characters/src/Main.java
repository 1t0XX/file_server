import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();
        int n = input.nextInt();
        if (n < s.length()) {
            System.out.println(s.substring(n) +""+ s.substring(0, n));
        } else {
            System.out.println(s);
        }
    }
}