class throw02 {
    //static ArithmeticException ae = new ArithmeticException() ;
    static ArithmeticException be = null ;
    public static void main(String [] Args) {
        // throw ae ; // object ch gheto , reference nahi
        throw be ; // Null pointer Exeception
    }
}
// Exception in thread "main" java.lang.ArithmeticException: Divide By Zero (custamized Exception)
//         at throw02.main(46throwPredefined.java:3)