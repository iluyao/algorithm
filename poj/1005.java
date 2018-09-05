import java.util.Scanner;
import java.lang.Math;

public class Main {
    
    public static void main (String[] args) {
        Scanner cin = new Scanner (System.in);
        int n = cin.nextInt();
        int N = 1;
        double pi = Math.PI;
        while (n -- > 0) {
            float x = cin.nextFloat();
            float y = cin.nextFloat();
            double d = Math.sqrt (x * x + y * y);
            double R;
            for (int i = 0; ; i ++) {
                R  = Math.sqrt (50 * 2 * i / pi);

                if (R > d) {
            
                    System.out.println("Property " + N++ + ": This property will begin eroding in year " + i + ".");
                    if(n == 0) {
                        System.out.println("END OF OUTPUT.");
                        break;
                    }
                    break;
                }
            }
        }
    }
}
