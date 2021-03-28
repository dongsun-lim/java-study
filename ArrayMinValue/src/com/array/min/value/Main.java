package com.array.min.value;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {4, 5, 3};

        System.out.println(solution(A, B));
    }

    public static int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int result = 0;
        for (int i = 0; i < A.length ; i++) {
            result += A[i] * B[A.length - i - 1];
        }

        return result;
    }
}