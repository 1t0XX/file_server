class Counter {

    static int count = 0;

    public static synchronized void inc() {
        count++;
    }
}