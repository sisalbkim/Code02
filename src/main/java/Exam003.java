public class Exam003{
    public static void main(String[] args){

        int i ;
        int hap = 0;

        for (i = 100; i <= 300; i++){
            if (i%5==0 || i% 7 ==0) {
                hap += i;
            }
        }
        System.out.print(hap);
    }
}