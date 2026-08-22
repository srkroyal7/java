class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] s = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                s[i + 1][j + 1] = s[i][j + 1] + s[i + 1][j] - s[i][j] + mat[i][j];
            }
        }
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r1 = Math.max(0, i - k);
                int c1 = Math.max(0, j - k);
                int r2 = Math.min(m - 1, i + k);
                int c2 = Math.min(n - 1, j + k);
                int r1_p = r1 + 1, c1_p = c1 + 1;
                int r2_p = r2 + 1, c2_p = c2 + 1;
                ans[i][j] = s[r2_p][c2_p] - s[r1_p - 1][c2_p] - s[r2_p][c1_p - 1] + s[r1_p - 1][c1_p - 1];
            }
        }
        return ans;
    }
}