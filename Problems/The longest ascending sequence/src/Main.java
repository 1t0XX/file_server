import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        int counter = 1;

        for (int i = 1; i < size; i++){
            int tempCounter = 1;
            while (i < size && array[i-1] < array[i]){
                tempCounter++;
                i++;
            }
            counter = tempCounter > counter ? tempCounter : counter;
        }
        System.out.println(counter);
    }
}
