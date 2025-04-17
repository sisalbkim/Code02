import java.util.Scanner;

public class Back02438 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        String a = "";


        for (int i = 0; i < x; i++) {
            a = a + "*";
            System.out.println(a);
        }s.close();
    }
}
