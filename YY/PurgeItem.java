import java.util.Scanner;                                                                                                                                                                                                                                                                                                                                                                                                                                                import java.util.Scanner;

public class Main {

    void PurgeItem(Linklist &list) {
        Linklist p, q = list;

        p = list->next;
        while (p != NULL) {
            if(p->data == item) {
                q->next = p->next;
                free(p);
                p = q->next;
            } else {
                q = p;
                p = p->next;
            }
        }
        if(list->data == item) {
            q = list;
            list = list->next;
            free(q);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[1024];
        Scanner cin = new Scanner(System.in);
        for(int i = 0; ; i ++) {
            arr[i] = cin.nextInt();
        }
        PurgeItem(arr);

        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]);
        }
    }
}
