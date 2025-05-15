import java.util.Scanner;

public class Back02884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h = s.nextInt();

        int m = s.nextInt();

        int time = (h*60+m-45);



        if (time < 0){
            time += (24*60);
        }
        System.out.print(time/60 + " " + time%60);


        s.close();

    }
}
