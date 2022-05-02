package com.practice;

public class SquareRoot {

    static double Square(double start,
                         double end, double n)
    {
        double mid = (start + end) / 2;
        double mul = mid * mid;

        // If mid itself is the square root,
        // return mid
        while(start<=end) {

            if ((mul == n) ||
                    (Math.abs(mul - n) < 0.00001))
                return mid;

                // If mul is less than n,
                // recur second half
            else if (mul < n)
                return Square( mid,end, n);

                // Else recur first half
            else
                return Square(start,mid , n);
        }
        return mid;
    }

    // Function to find the square root of n
    static void findSqrt(double n)
    {
        double i = 1;

        // While the square root is not found
        boolean found = false;
        while (!found)
        {

            // If n is a perfect square
            if (i * i == n)
            {
                System.out.println(i);
                found = true;
            }

            else if (i * i > n)
            {

                // Square root will lie in the
                // interval i-1 and i
                double res = Square(n, i - 1, i);
                System.out.printf("%.5f", res);
                found = true;
            }
            i++;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        double n = 3;
   System.out.println(Square(0,3,3));
       // findSqrt(n);
    }
}
