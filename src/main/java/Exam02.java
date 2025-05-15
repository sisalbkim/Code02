import java.util.Scanner;

public class Exam02{
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);

        String a = s.nextLine() , b = s.nextLine();

        System.out.println((a+b).toLowerCase().replaceAll(" ",""));
        s.close();
    }
}