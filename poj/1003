import java.util.Scanner;
 
public class Main {
    public static void main (String[] args) {
         
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextDouble()) {
            double len = cin.nextDouble();
            if(len == 0.00) break;
            int n = 1;
            double sum = 0;
            while (sum < len) {
                sum += 1.0 / ++n;
            }
            System.out.print(n - 1);
            System.out.println (" card(s)");
        }
    }
}
