import java.util.Scanner;

public class Back02444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x*2-1; i++) {
            if (i<=x){
                for (int j = 1; j <= x-i; j++){
                    System.out.print(" ");
                }for (int k = 0; k < 2*i-1; k++) {
                    System.out.print("*");
                }
            }else{
                for (int j = 1; j <= i-x; j++){
                    System.out.print(" ");
                }for (int k = 1; k <= 2*(2*x-i)-1; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();


        }

    }
}
