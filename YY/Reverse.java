import util.java.Scanner;

public class Main {

  void Reverse(Linklist &list) {
    Linklist p, q, r;
    p = list;
    q = NULL;
    while (p != NULL) {
      r = q;
      q = p;
      p = p->next;
      q->next = r;
    }
    list = q;
  }
  
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    int n = cin.nextInt();
    int arr[] = new int[n];
    
    for(int i = 0; i < n; i ++) {
      arr[i] = cin.nextInt();
    }
    
    Reverse(arr[], n);
    for(int i = 0; i < n; i ++) {
      System.out.print(arr[i] + " ");
    }
  }
}

