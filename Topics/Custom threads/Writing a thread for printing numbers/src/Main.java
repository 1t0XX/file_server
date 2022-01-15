class NumbersThread extends Thread {
    int from;
    int to;

    public NumbersThread(int from, int to) {
        // implement the constructor
        this.from = from;
        this.to = to;
    }

    // you should override some method here
    @Override
    public void run() {
        // implement the method to print the message stored in a field
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }
}