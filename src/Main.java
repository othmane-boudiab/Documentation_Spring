package com.tesst;

public class Main {
    public static void main(String[] args){
//        int[] ints = {1, 20, 3, 10, -2, 100};
//        int result = Solution.sunRange(ints);
//        System.out.println("result : "+result);
//        System.out.println("expected result : 130");

//        Counter.increment();
//        System.out.println(Counter.increment());


//        int[] numbers = {2,-28,80,300,600};
//        int result = Algorithm.findLargest(numbers);
//        System.out.println(result);


        Thread t1 = new Thread(new Counter());
        t1.start();
        Thread t2 = new Thread(new Counter());
        t2.start();
    }
}
