import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner cin = new Scanner(System.in);
    int n = cin.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i ++) {
        arr[i] = cin.nextInt();
    }

    for(int i = 0; i < n; i ++) {
        for(int j = n - 1; j > i; j --) {
            if(arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    for(int i = 0; i < n; i ++) {
        System.out.print(arr[i] + " ");
    }
    }
}
