import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int maxLength = 0;
        String stLong = null;
        for (String st : arr) {
            if (st.length() > maxLength) {
                maxLength = st.length();
                stLong = st;
            }
        }
        System.out.println(stLong);
    }
}