public class Test01 {
    public static void main(String[] args) {

        String log = "127.0.0.1 - Scott [10/Dec/2019:13:55:36 -0700] \"GET /server-status HTTP/1.1\" 200 232";

        int a = log.indexOf("\"");
        int b = log.indexOf(" ",a);

        System.out.println(log.substring(a+1,b));

        //System.out.println(log.substring(log.indexOf("GET"),log.indexOf("Get")+3));



    }
}
