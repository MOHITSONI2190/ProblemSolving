package com.practice;

public class LargestSubGrid {

    static int findMaxMatrixSize(int[][] arr, int maxSum)
    {

        int n = arr.length;
        int m = arr[0].length;
        int[][] sum = new int[n + 1][m + 1];
     //   int i, j;

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    sum[i][j] = 0;
                    continue;
                }
                sum[i][j] = arr[i - 1][j - 1]
                        + sum[i - 1][j] + sum[i][j - 1]
                        - sum[i - 1][j - 1];
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i + ans - 1 > n || j + ans - 1 > m)
                    break;

                int mid, lo = ans;
                int hi = Math.min(n - i + 1, m - j + 1);
                while (lo < hi) {

                    mid = (hi + lo + 1) / 2;
                    if (sum[i + mid - 1][j + mid - 1]
                            + sum[i - 1][j - 1]
                            - sum[i + mid - 1][j - 1]
                            - sum[i - 1][j + mid - 1]
                            <= maxSum) {
                        lo = mid;
                    }
                    else {
                        hi = mid - 1;
                    }
                }
                ans = Math.max(ans, lo);
            }
        }

        return ans;
    }
}
