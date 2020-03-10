import java.util.*;
public class One {
    public static void main(String[] args) {
        int i, min, max, n, temp1, temp2;
        int a[];
        System.out.println("输入数组的长度:");
        Scanner One = new Scanner(System.in);
        n = One.nextInt();
        a = new int[n];
        for (i = 0; i < n; i++)
            a[i] = One.nextInt();
        max = 0;
        min = 0;
        for (i = 1; i < n; i++) {
            if (a[i] > a[max])
                max = i;
        }

        temp1 = a[0];

        a[0] = a[max];
        a[max] = temp1;
        for (i = 1; i < n; i++) {
            if (a[i] < a[min])
                min= i;
        }

        temp2 = a[min];
        a[min] = a[n - 1];
        a[n - 1] = temp2;
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }

}

