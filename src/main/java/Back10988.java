import java.util.Scanner;

public class Back10988 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String x = s.nextLine();

        int res = 1;


        for (int i = 0; i < x.length()/2; i++) {
            char c = x.charAt(0+i);
            char d = x.charAt(x.length()-1 -i);
            if (c != d){
                res = 0;
                break;
            }

        }
        System.out.println(res);

    }
}
