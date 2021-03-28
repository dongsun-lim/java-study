package com.missing.integer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class MissingInteger {

    public static void main(String[] args) {
//        System.out.println("N*(N-1)/2");
//        solution(new int[]{1, 3, 6, 4, 2});
//
//        System.out.println("XOR");
//        xor(new int[]{1, 3, 6, 4, 2});

        test();
    }

    public static void test() {
        String s = "1234567";
//        System.out.println(s.length());

//        for (int i = 0; i < s.length() / 3; i++) {

//            System.out.println(s.substring(s.length() - 3, s.length()));
//        System.out.println(s.substring(s.length() - 6, s.length()-3));
//        System.out.println(s.substring(s.length() - 9, s.length()-6));

//        }

        Queue<String> queue = new LinkedList<>();
        Map<Integer, String> map = new HashMap<>();




        int digit = 3;
        int begin = 0;
        int end = 0;
        Deque<CharSequence> deque = new ArrayDeque<>();
        for (int i = 0; i <= s.length() / digit; i++) {
            begin = s.length() - digit * (i + 1);
            if (begin < 0) {
                begin = 0;
            }
            end = s.length() - (digit * i);
            if (end < 0) {
                end = 0;
            }

            deque.push(s.substring(begin, end));
        }

        for (CharSequence cs : deque) {
            System.out.print(deque.pop());
            if (deque.size() != 0) {
                System.out.print(",");
            }
        }
    }

    public static void xor(int[] num) {
        int result = 0;
        for (int n : num) {
            result ^= n;
        }

        System.out.println(result);
    }

    public static void solution(int[] num) {
        int max = 0;
        int sum = 0;
        for (int n : num) {
            if (max < n) {
                max = n;
            }

            sum += n;
        }

        // N*(N-1)/2 이 N 까지의 합
        System.out.println((max * (max + 1) / 2) - sum);
    }

    public static void solutionA(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int num = Integer.parseInt(br.readLine());
        for(int i = 1; i <= num; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            while(st.hasMoreTokens()) {
                int temp = Integer.parseInt(st.nextToken());
                if(temp % 2 != 0) {
                    sum += temp;
                }
            }
            System.out.println("#" + i + " " + sum);
            sum = 0;
        }
    }
}
