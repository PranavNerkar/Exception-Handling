class MultipleCatch {
    public static void main(String [] args) {
        try {
            System.out.println("10/0") ;
        } catch(ArithmeticException Ae) {
            System.out.println("Arithmetic Exception 01") ;
        } catch(Exception Ae) { //   Child Nantar Parent Chalto
            System.out.println("Arithmetic Exception 02") ;
        }
    }
}