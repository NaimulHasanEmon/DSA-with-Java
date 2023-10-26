public class Main {
    public static String LongestCommonSubsequence(String a, String b, int m, int n) {
        int[][] T = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0)
                    T[i][j] = 0;
                else if (a.charAt(i - 1) == b.charAt(j - 1))
                    T[i][j] = T[i - 1][j - 1] + 1;
                else
                    T[i][j] = Math.max(T[i][j - 1], T[i - 1][j]);
            }
        }
        int index = T[m][n];
        int i = m, j = n;
        char[] lcs = new char[index];
        while (i > 0 && j > 0) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                lcs[index - 1] = a.charAt(i - 1);
                i--;
                j--;
                index--;
            } else if (T[i - 1][j] > T[i][j - 1])
                i--;
            else
                j--;
        }
        return new String(lcs);
    }

    public static void main(String[] args) {
        String a = "BCDAACD";
        String b = "ACDBAC";
        System.out.println("Longest Common Subsequence is: " + LongestCommonSubsequence(a, b, a.length(), b.length()));
    }
}
