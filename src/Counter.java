package com.tesst;

public class Counter extends Thread {
    private static int count = 0;

    /*
     * Increments count in a thread-safe manner
     */
    public synchronized static int increment() {
        count += 1;
        return count;
    }

    @Override
    public void run() {
        System.out.println(
                Counter.increment()
        );
    }
}
