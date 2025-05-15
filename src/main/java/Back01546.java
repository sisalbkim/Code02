import java.util.Arrays;
import java.util.Scanner;

public class Back01546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int []n = new int[a];
        for (int i = 0; i < a; i++) {
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        float hap = 0;
        for (int i = 0; i < a; i++) {
            hap += (float)n[i]/n[a-1]*100;
        }

        hap = hap/a;

        System.out.println(hap);


    }
}
