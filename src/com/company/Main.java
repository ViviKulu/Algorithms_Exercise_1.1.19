package com.company;

public class Main {

    //    Run the following program on your computer:

    //    public class Fibonacci{
    //        public static long F(int N)
    //        {
    //            if (N == 0) return 0;
    //            if (N == 1) return 1;
    //            return F(N-1) + F(N-2);
    //        }
    //
    //    public static void main(String[] args){
    //        for (int N = 0; N < 100; N++)
    //              StdOut.println(N + " " + F(N));
    //        }
    //    }

    //    What is the largest value of N for which this program takes less 1 hour to compute the
    //    value of F(N)? Develop a better implementation of F(N) that saves computed values in
    //    an array.

    //    Answer:

    //    The largest value of N for which this program takes less than 1 hour to compute the value of F(N)
    //    is 7540113804746346429.

    public static void main(String[] args) {
        // write your code here
        for (int N = 0; N < 100; N++)
            System.out.println(N + " " + F(N));
    }

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;

        long[] a = new long[N + 1];
        a[0] = 0;
        a[1] = 1;

        for (int i = 2; i <= N; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[N];
    }
}
