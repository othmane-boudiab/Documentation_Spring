package com.tesst;

public class Solution {
    static int sunRange(int[] ints) {
        int sum = 0;
        for (int i = 1; i < ints.length; i++) {
            int n = ints[i];
            if (n>=10 && n<=100) {
                sum +=n;
            }
        }
        return sum;
    }
}
