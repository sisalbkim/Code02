public class Code04_13 {
    public static void main(String[] args) {
        String str = "   한글   ABCD   efgh   ";
        String cutStr = "";
        String reStr = "";
        boolean res;

        cutStr = str.trim();

        reStr = str.replaceAll(" ","");

        res = str.isEmpty();

        boolean res2 = str.length() == 0;

        System.out.println("기존 문자열 ==> [" + str + "]");
        System.out.println("공백 제거 ==> [" + cutStr + "]");
        System.out.println(reStr);
        System.out.println(res);
        System.out.println(res2);
    }
}
