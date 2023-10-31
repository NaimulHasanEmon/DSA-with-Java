public class Main {
    public static String LongestCommonSubsequence(String a, String b, int m, int n) {
        if (a.equals(b))
            return a;
        int[][] T = new int[m + 1][n + 1];
        for (int i = 0; i < a.length(); i++) {
            T[i][0] = 0;
        }
        for (int i = 0; i < b.length(); i++) {
            T[0][i] = 0;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1))
                    T[i][j] = T[i - 1][j - 1] + 1;
                else
                    T[i][j] = Math.max(T[i][j - 1], T[i - 1][j]);
            }
        }
        int i = m, j = n;
        StringBuffer sb = new StringBuffer();
        while (i > 0 && j > 0) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                sb.insert(0, a.charAt(i - 1));
                i--;
                j--;
            } else if (T[i - 1][j] > T[i][j - 1])
                i--;
            else
                j--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "BCDAACD";
        String b = "ACDBAC";
        System.out.println(
                "Longest Common Subsequence is: " + LongestCommonSubsequence(a, b, a.length(), b.length()));
    }
}
