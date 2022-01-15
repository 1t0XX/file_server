import java.util.*;

class GCcontent {
    static Locale localePL = new Locale.Builder().setLanguage("pl").setRegion("PL").build();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] genom = scanner.next().toLowerCase(localePL).toCharArray();
        int counter = 0;
        double gcContent = 0;

        for (char ch : genom){
            if (ch == 'c' || ch == 'g'){
                counter++;
            }
        }
        gcContent = (double) counter/genom.length * 100;
        System.out.println(gcContent);
    }
}
