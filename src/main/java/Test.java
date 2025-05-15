public class Test{
    public static void main(String[] args){

        for (int i = 1; i <=7; i++){
            int n;

            if (i <=4){
                n = i;
            }

            else{
                n = 8-i;
            }

            for (int j = 1; j <= n ; j++){
                System.out.print("*");
            }System.out.println(" ");
        }
    }
}