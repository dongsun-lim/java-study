package com.game;

import java.util.Arrays;

public class Game {

    public static void main(String[] args) {
        int[] A = {10, 4, 2, 14};
        int[] B = {4, 4, 12, 16};

        System.out.println(solution(A, B));
    }

    public static int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int result = 0;
        for (int i = A.length - 1, j = B.length - 1; i >= 0; i--) {
            if (B[j] > A[i]) {
                result++;
                j--;
            }
        }

        return result;
    }
}
