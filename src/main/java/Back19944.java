import java.util.Scanner;

public class Back19944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2020 INPC는 IGRUS 뉴비들을 위해 열리는 대회입니다. 하지만 영수 할아버지나 인용 할아버지와
        // 같이 14학번이지만 마음만은 뉴비인 어르신들 때문에 대회장이 TLE들의 파티가 되자 뉴비의 기준을 정의하기로 하였습니다.
        //
        //INPC 운영진들은 고심 끝에 뉴비를 1학년 혹은 2학년인 학생으로 정의 내렸고
        // 뉴비를 정의하는 김에 올드비와 TLE도 정의 내리기로 하였습니다.
        // 올드비는 N학년 이하이면서 뉴비가 아닌 학생으로 정의하기로 하였고
        // TLE은 뉴비도 아니고 올드비도 아닌 학생으로 정의하였습니다.
        //
        //N과 M이 주어졌을 때, M학년이 뉴비인지 올드비인지 TLE인지 구별해 주세요.
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(m < 3){
            System.out.println("NEWBIE!");
        }else if (m <= n){
            System.out.println("OLDBIE!");
        }else {
            System.out.println("TLE!");
        }

        sc.close();

    }
}
