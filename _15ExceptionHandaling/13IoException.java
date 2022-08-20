import java.io.* ;

class IoException01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int a = Integer.parseInt(br.readLine()) ;// readline mule error yeto
        // Mhanun throws IOExceptionn He lihawa lagta

    //    error: unreported exception IOException; must be caught or declared to be thrown
    //          int a = Integer.parseInt(br.readLine()) ;
    //                                               ^  
    //          1 error
    }
}
/*
    Exception in thread "main" java.lang.NumberFormatException: For input string: "char"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:660)
        at java.base/java.lang.Integer.parseInt(Integer.java:778)
        at IoException01.main(13IoException.java:6)
*/