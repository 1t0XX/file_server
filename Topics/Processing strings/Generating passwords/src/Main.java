import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < a; i++) {
            password += "AB".charAt(i % 2);
        }

        for (int i = 0; i < b; i++) {
            password += "ab".charAt(i % 2);
        }

        for (int i = 0; i < c; i++) {
            password += "12".charAt(i % 2);
        }

        while (password.length() < n) {
            password += "AB".charAt(password.length() % 2);
        }

        System.out.println(password);
    }
}
