import java.util.Scanner;

public class Code09_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n[] = new int[4];
        int hap = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("숫자 : ");
            n[i] = sc.nextInt();
            hap += n[i];
        }

        System.out.println("합계 ==> " + hap);
        sc.close();

    }
}
