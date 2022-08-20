import java.io.* ;

class Exception04 {
    public static void main(String[] Args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in)) ;
        int a = Integer.parseInt(br.readLine()) ;

        System.out.println(a) ;
    }
} 
// jar input ha int dyacha asel pan aapn string dili tar hota

// Exception in thread "main" java.lang.NumberFormatException: For input string: "shahi"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:660)
//         at java.base/java.lang.Integer.parseInt(Integer.java:778)de
//         at Exception04.main(10NumberFormatExpression.java:6)