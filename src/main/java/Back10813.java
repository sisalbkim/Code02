import java.util.Scanner;

public class Back10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []x = new int[n];
        int m = sc.nextInt();
        int z = 0;

        for (int i = 0; i < n; i++) {
            x[i] = i+1;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            z = x[a-1];
            x[a-1] = x[b-1];
            x[b-1] = z;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
