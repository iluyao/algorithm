import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner cin = new Scanner(System.in);
		
		int x = 1;
		while (cin.hasNextInt()) {
			int p = cin.nextInt();
			int e = cin.nextInt();
			int i = cin.nextInt();
			int d = cin.nextInt();
			if (p < 0 && e < 0 && i < 0 && d < 0) break;
			for (int n = 0; ; n ++) {
				int a = 23 * n + p - d;

				if((a - e + d) % 28 == 0 && (a - i + d) % 33 == 0) {
                    int result = (a % 21252 + 21252) % 21252;
                    System.out.println("Case " + x++  + ": the next triple peak occurs in " + (result == 0 ? 21252 : result) + " days.");

                    break;

				}
		    }
        }
	}
}
