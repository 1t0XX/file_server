class CountDownCounter {

    volatile static int count;

    public CountDownCounter(int initial) {
        count = initial;
    }

    public static synchronized void decrement() {
        count--;
    }
}