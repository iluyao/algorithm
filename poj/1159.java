import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        String str = cin.next();
        int[][] dp = new int[2][N];

        for (int i = N - 1; i >= 0; i--) {
            for (int j = i; j < N; j++) {
                if (i == j) {
                    dp[i & 1][j] = 0;
                } else if (str.charAt(i) == str.charAt(j)) {
                    dp[i & 1][j] = dp[i + 1 & 1][j - 1];
                } else {
                    dp[i & 1][j] = Math.min(dp[i + 1 & 1][j], dp[i & 1][j - 1]) + 1;
                }
            }
        }

        System.out.println(dp[0][N - 1]);
        cin.close();;
    }
}
