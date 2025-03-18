import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        int a;
        int b;


        System.out.println("첫번째 값을 입력하세요 ==> ");
        a = s.nextInt();
        System.out.println(a);


        System.out.println("두번째 값을 입력하세요 ==> ");
        b = s.nextInt();
        System.out.println(b);

        System.out.println(a + " + " + b + " = " + (a + b));

        s.close();

//확인용


    }
}
