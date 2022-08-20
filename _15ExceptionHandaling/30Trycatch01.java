class Trycatch01 {
    public static void main(String [] args) {
        System.out.println("Before Exception") ;
        // System.out.println(10/0) ; abnormal Termination
        try {
            System.out.println(10/0) ;
        }catch(ArithmeticException e) { //catch(Exception e) {  
            System.out.println("Handaling Code") ; // Normal Termination
        }
        System.out.println("After Exception") ;
    }
}