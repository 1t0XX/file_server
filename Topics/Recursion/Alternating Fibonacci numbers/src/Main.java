import java.util.Scanner;

public class Main {

    public static long fib(long n) {
        // write your code here
        long fibNum = 0;
        if (n % 2 == 0) {
            fibNum = -fibHelper(n);
        } else {
            fibNum = fibHelper(n);
        }
        return fibNum;
    }

    private static long fibHelper(long n) {
        if (n <= 1) {
            return n;
        } else {
            return fibHelper(n - 1) + fibHelper(n - 2);
        }
    }


    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}