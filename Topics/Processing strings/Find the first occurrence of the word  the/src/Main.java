import java.util.*;

class TheFinder {
    static Locale plLocale = new Locale.Builder().setLanguage("pl").setRegion("PL").build();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase(plLocale);

        if (sentence.contains("the")){
            int place = sentence.indexOf("the");
            System.out.println(place);
        } else {
            System.out.println("-1");
        }
    }
}
