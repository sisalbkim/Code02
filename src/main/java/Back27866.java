import java.util.Scanner;

public class Back27866 {
    public static void main(String[] args) {

        //단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.

        //첫째 줄에 영어 소문자와 대문자로만 이루어진 단어
        //S가 주어진다. 단어의 길이는 최대 1,000이다.
        //둘째 줄에 정수i가 주어진다. (1 <= i <= |S|)

        Scanner s = new Scanner(System.in);
        //System.out.print("단어를 입력하세요 :" );
        String S = s.nextLine();

        //System.out.print("정수를 입력하세요 :" );
        int i = s.nextInt();

        System.out.println(S.substring(i-1, i));

        s.close();

    }
}
