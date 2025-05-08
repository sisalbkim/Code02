import java.util.Scanner;

public class Back02480 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);


        int a = s.nextInt();

        int b = s.nextInt();

        int c = s.nextInt();

        int result = 0;
        if (a == b && b == c && c == a){
            System.out.print((10000 + (a * 1000)));
        }else if (a == b || b == c || c == a){

            if (a == b) {
                result = a;
            }
            if (a == c) {
                result = a;
            }
            if (b == c) {
                result = b;
            }
            System.out.print((1000 + (result * 100)));
        }else {
            if (a > b){
                result = a;
            }else{
                result = b;
            }if (result < c){
                result = c;
            }


            System.out.print(result * 100);
        }

        s.close();


    }
}
