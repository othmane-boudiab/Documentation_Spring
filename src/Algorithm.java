package com.tesst;

import java.util.Arrays;

public class Algorithm {
    public static int findLargest(int[] numbers) {
//Your code
        // sort the array first
        Arrays.sort(numbers);

        // Return last element of array
        return numbers[numbers.length-1];
    }
}
