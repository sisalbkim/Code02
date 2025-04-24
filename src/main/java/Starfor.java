import java.util.Scanner;

public class Starfor {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("최대 별 개수를 입력하세요 : ");
        int x = s.nextInt();
        String a = "";


        for (int i = 0; i < x; i++){
            a = a+"*";
            System.out.println(a);

        }
        for (int i = x; i > 0; i--){
            a = a.substring(0, a.length() - 1);
            System.out.println(a);

        }


    }
}
