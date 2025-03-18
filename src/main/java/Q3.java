import java.util.Scanner;

public class Q3{
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        int a;
        int b;


        System.out.print("첫번째 값을 입력하세요");
                a = s.nextInt();
        System.out.println(a);

        System.out.print("두번째 값을 입력하세요");
        b = s.nextInt();
        System.out.println(b);

        System.out.println(a + " - " + b + " = " + (a-b));

    }
}
