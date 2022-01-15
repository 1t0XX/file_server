import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        int rotations = scanner.nextInt();
        int length = data.length;
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++){
            numbers[i] = Integer.parseInt(data[i]);
        }

        int[] rotatedNumbers = new int[length];
        for (int i = 0; i < length; i++){
            rotatedNumbers[(i + rotations) % length] = numbers[i];
        }
        for (int elem : rotatedNumbers){
            System.out.print(elem + " ");
        }
    }
}
