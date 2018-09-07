import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		if(a >= 0 && b <= 10) {
			int c = a + b;
			System.out.println(c);
		} 
		return 0;

	}
}
