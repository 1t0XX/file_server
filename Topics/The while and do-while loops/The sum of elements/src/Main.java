import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int element = scanner.nextInt();
        int sum = element;

        while (element != 0) {
            element = scanner.nextInt();
            sum += element;
        }
        System.out.println(sum);
    }
}