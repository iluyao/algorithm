import java.util.Scanner;

public class Main {
    void Reverse(int arr[], int n) {
        int i, t;
        for(i = 0; i < n/2; i ++) {
            t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i -1] = t;
        }
    }

    public static void main (String[] args) {
        Scanner cin = new Scanner(System.in);
        int arr[] = new int[64];
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = cin.nextInt();

           // Reverse(arr[], arr.length);
        }

        Reverse(arr[], arr.length);

        for(int j = 0; j < arr.length; j ++) {
            System.out.println(arr[j]);
        }
    }
}
