import java.util.Scanner;

public class Back11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int c = 0;


        for (int i = 0; i < a; i++) {
            c += Integer.parseInt(b.substring(i,i+1));

        }
        System.out.println(c);
        sc.close();
    }
}
