import java.util.Arrays;
import java.util.Scanner;

public class Back03052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int []n = new int[10];
        int ans = 1;
        for (int i = 0; i < 10; i++) {
            a = sc.nextInt();
            n[i] = a%42;
        }

        Arrays.sort(n);
        for (int i = 1; i < 10; i++) {
            if (n[i-1] != n[i]){
                ans++;
            }
        }
        System.out.println(ans);


    }
}
