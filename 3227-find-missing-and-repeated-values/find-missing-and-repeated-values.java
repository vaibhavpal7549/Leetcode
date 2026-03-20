class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;

        long expectedSum = (long) N * (N + 1) / 2;
        long expectedSquareSum = (long) N * (N + 1) * (2 * N + 1) / 6;

        long actualSum = 0;
        long actualSquareSum = 0;

        for (int[] row : grid) {
            for (int num : row) {
                actualSum += num;
                actualSquareSum += (long) num * num;
            }
        }

        long A = actualSum - expectedSum; // x - y
        long B = (actualSquareSum - expectedSquareSum) / A; // x + y

        long x = (A + B) / 2; // repeated
        long y = x - A;       // missing

        return new int[]{(int)x, (int)y};
    }
}