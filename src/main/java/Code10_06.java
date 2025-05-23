public class Code10_06 {
    static int hap_para2(int a, int b){
        int result;
        result = a + b;
        return result;
    }
    static int hap_para3(int a, int b, int c) {
        int result;
        result = a + b + c;
        return result;
    }

    public static void main(String[] args) {
        int hap;
        hap = hap_para2(3, 4);
        System.out.println("매개변수 2개 메서드 호출 결과 ==> " + hap);


        hap = hap_para3(3, 4 , 5);
        System.out.println("매개변수 3개 메서드 호출 결과 ==> " + hap);
    }
}
