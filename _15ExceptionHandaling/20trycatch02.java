class trycatch02 {
    public static void main(String[] arg) {
        System.out.println("Core2Web") ;
        // System.out.println(10/0) ;
        try {
            System.out.println(10/0) ;
        }catch(ArithmeticException e) { // Exception Catch kela
            
        }
        System.out.println("Biencaps") ;
    }
}