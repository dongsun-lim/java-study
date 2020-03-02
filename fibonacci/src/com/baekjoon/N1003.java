package com.baekjoon;

import java.util.Scanner;

public class N1003 {
    private static int zeroCount = 0;
    private static int oneCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            // N 번째 피보나치 수를 구할 때
            fibonacci(n);

            System.out.println(zeroCount + " " + oneCount);
            zeroCount = 0;
            oneCount = 0;
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            zeroCount++;
            // n이 0이면 0 반환
            return 0;
        } else if (n == 1) {
            oneCount++;
            // n이 1이면 1 반환
            return 1;
        } else {
            // 그 밖의 경우에는 N-1 + N-2 반환
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
