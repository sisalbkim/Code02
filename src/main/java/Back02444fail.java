import java.util.Scanner;

public class Back02444fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i=1; i<=x*2-1; i++){
            for (int j=1; j<=x*2-1; j++){
                if (i<x){
                    if(x-i<j && j<x+i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }

                }else{
                    if((i-x) < j && j < 2*x-(i-x)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }System.out.println();
        }

    }
}
