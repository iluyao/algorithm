import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner cin = new Scanner(System.in);
        double sum = 0;
        double a[] = new double[256];
        for(int i = 0; i < 12; i ++) {
            a[i] = cin.nextDouble();
        }
        for(int j = 0; j < 12; j ++) {
            sum += a[j];
        }
        double aver = sum / 12;

        if (aver * 1000 % 10 > 4) {
            System.out.print("$" + ((int)(aver * 100) + 1) / 100.0);
        } else {
            System.out.print("$" + ((int)(aver * 100)) / 100.0);
        }
    }
}
