import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dna = scanner.nextLine();
        int counter = 1;

        for (int i = 0; i < (dna.length() - 1); i++) {
            if (dna.charAt(i) == dna.charAt(i + 1)) {
                counter++;
            } else {
                System.out.print(dna.charAt(i) + "" + counter);
                counter = 1;
            }
        }
        if (!dna.isEmpty()) {
            System.out.print(dna.charAt(dna.length() - 1) + "" + counter);
        } else {
            System.out.println("0");
        }
    }
}
