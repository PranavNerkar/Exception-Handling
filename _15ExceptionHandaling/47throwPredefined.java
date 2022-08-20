import java.io.* ;

class throw02 {
    static IOException io = new IOException("Exception Handled") ; // ha msg print hoto 
    // hi string IOException Chya constructor la pass keli zate
    // mag obj pass kela tar to hi String parameter mhanun ghete
    public static void main(String [] Args) {
        try {
            throw io ;
        }catch(IOException obj) {
            System.out.println(obj) ; // ithe (obj , obj.toString())
        }
    }
}
// Exception in thread "main" java.lang.ArithmeticException: Divide By Zero (custamized Exception)
//         at throw02.main(46throwPredefined.java:3)