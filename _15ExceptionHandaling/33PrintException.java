class PrintException {
    public static void main(String [] args) {
        try {
            System.out.println(10/0) ;
        } catch(Exception e) {
            e.printStackTrace() ; // hyamule 
            // java.lang.ArithmeticException: / by zero   ^^
            //      at PrintException.main(33PrintException.java:4)

            System.out.println(e.toString()) ;
            // java.lang.ArithmeticException: / by zero   ^^
            
            System.out.println(e.getMessage()) ;
            // / by zero   ^^
        }
    }
}