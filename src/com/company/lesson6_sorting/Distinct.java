package com.company.lesson6_sorting;

import java.util.Arrays;

/**
 Write a function
 class Solution { public int solution(int[] A); }
 that, given an array A consisting of N integers, returns the number of distinct values in array A.

 For example, given array A consisting of six elements such that:
     A[0] = 2    A[1] = 1    A[2] = 1
     A[3] = 2    A[4] = 3    A[5] = 1
 the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

 Write an efficient algorithm for the following assumptions:
     N is an integer within the range [0..100,000];
     each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

public class Distinct {
    public int solution(int[] A) {
        int n = A.length;
        int countDistinct = 1;
        if (n == 0)
            return 0;
        Arrays.sort(A);
        for (int i = 1; i < n; i++) {
            if (A[i] != A[i - 1])
                countDistinct++;
        }
        return countDistinct;
    }
}
