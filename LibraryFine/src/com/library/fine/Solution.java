package com.library.fine;

import java.io.IOException;


// https://www.hackerrank.com/challenges/library-fine/problem

public class Solution {

    private static final int YEAR_LATE = 10000;
    private static final int MONTH_LATE = 500;
    private static final int DAY_LATE = 15;

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // YEAR 부터
        // 늦었을 때 뿐만 아니라 기간 내 반납이 되었을 때도 생각한다...
        // d1, m1, y1: returned date day, month and year
        // d2, m2, y2: due date day, month and year

        if (y1 > y2) {
            return YEAR_LATE;
        } else if (y1 < y2) {
            return 0;
        }

        if (m1 > m2) {
            return (m1 - m2) * MONTH_LATE;
        } else if (m1 < m2) {
            return 0;
        }

        if (d1 > d2) {
            return (d1 - d2) * DAY_LATE;
        } else if (d1 < d2) {
            return 0;
        }

        return 0;
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String[] d1M1Y1 = scanner.nextLine().split(" ");
        String[] d1M1Y1 = "9 6 2015".split(" ");

        int d1 = Integer.parseInt(d1M1Y1[0]);

        int m1 = Integer.parseInt(d1M1Y1[1]);

        int y1 = Integer.parseInt(d1M1Y1[2]);

//        String[] d2M2Y2 = scanner.nextLine().split(" ");
        String[] d2M2Y2 = "6 6 2015".split(" ");

        int d2 = Integer.parseInt(d2M2Y2[0]);

        int m2 = Integer.parseInt(d2M2Y2[1]);

        int y2 = Integer.parseInt(d2M2Y2[2]);

        int result = libraryFine(d1, m1, y1, d2, m2, y2);

        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}

