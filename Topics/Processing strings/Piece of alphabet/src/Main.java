import java.util.Scanner;

class Alphabetical {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        sc.close();
        System.out.println(pieceOfAlphabet(data));
    }

    public static String pieceOfAlphabet(String data) {
        char ch = data.charAt(0);
        for (int i = 0; i < data.length(); i++) {
            if (ch != data.charAt(i)) {
                return "false";
            }
            ch++;
        }
        return "true";
    }

}
