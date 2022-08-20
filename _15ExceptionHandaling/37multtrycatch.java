class MultipleCatch {
    public static void main(String [] args) {
        try {
            System.out.println("10/0") ;
        } catch(Exception Ae) {
            System.out.println("Arithmetic Exception 01") ;
        }  { // catch(ArithmeticException Ae) Parent Nantar Child Chalat nahi
            System.out.println("Arithmetic Exception 02") ;
        }
    }
}