class finally01 {
    public static void main(String [] args) {
        try {
            System.out.println("In Try") ;
            System.out.println(10/0) ;
        } catch(Exception Ae) {
            System.out.println("In Catch") ;
        } finally {
            System.out.println("in finally") ;
        }
    }
}