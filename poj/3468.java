import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Scanner cchar = new Scanner(System.in);
        int in = cin.nextInt();
        int n = cin.nextInt();
        int arr[] = new int[100000];
        for(int i = 0; i < in; i ++) {
            arr[i] = cin.nextInt();
        }
        while(n -- >0) {
            char index = cchar.nextChar();
            int m = cin.nextInt();
            int p = cin.nextInt();
            int q = cin.nextInt();
            if(index == 'Q') {
                int sum = 0;
                for(int i = m; i < p; i ++) {
                    sum += arr[i];
                }
                System.out.println(sum);
            }
            if(index == 'C') {
                for(int i = m; i < p; i ++) {
                    arr[i] = arr[i] + q;
                    continue;
                }
            }
        }
    }
}
