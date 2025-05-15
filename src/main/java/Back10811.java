import java.util.Scanner;

public class Back10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int []n = new int[x];
        for (int i = 0; i < x; i++) {
            n[i] = i+1;
        }

        int c = 0;
        for (int i = 0; i < y; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            while (a<b){
                c = n[a];
                n[a] = n[b];
                n[b] = c;
                a++;
                b--;
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.println(n[i]);
        }



    }
}
