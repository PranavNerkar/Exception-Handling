
class MultipleCatch {
    public static void main(String [] args) {
        try {
            System.out.println("10/0") ;
        } catch(ArithmeticException Ae) {
            System.out.println("Arithmetic Exception 01") ;
        }  { // catch(ArithmeticException Ae) Don Arithmaetic Chalat Nahi
            System.out.println("Arithmetic Exception 01") ;
        }
    }
}