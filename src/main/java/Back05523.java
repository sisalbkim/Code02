import java.util.Scanner;

public class Back05523 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int x = 0;
        int y = 0;


        for (int i = 1; i <= n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            if (a > b) {
                x += 1;
            }else if (a < b){
                y += 1;
            }

        }System.out.print(x + " " + y);

        s.close();
    }
}
