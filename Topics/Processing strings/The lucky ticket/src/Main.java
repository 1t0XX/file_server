import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String numbers[] = input.nextLine().split("");

        int size = numbers.length;

        int sum1 = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]) + Integer.parseInt(numbers[2]);
        int sum2 = Integer.parseInt(numbers[size - 3]) + Integer.parseInt(numbers[size - 2]) + Integer.parseInt(numbers[size - 1]);

        if (sum1 == sum2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }

    }
}
