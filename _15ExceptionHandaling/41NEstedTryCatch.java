class NestedTryCatch01 {
    public static void main(String[] Args) {
        // NestedTryCatch01 obj = null ;
        try {
            System.out.println("Outer Try") ; // 01
            try {
                System.out.println("Inside Outer Try") ; // 02
                System.out.println(10/0) ;
            }catch(ArithmeticException ae) {
                System.out.println("Inside Inner catch(try)") ; // 03
            }
        }catch(NullPointerException nu) {
            try {
                System.out.println("Inside Outer catch") ;
            }catch(ArithmeticException ae) {
                System.out.println("Inside catch catch(try)") ;
            }
        }finally {
            try {
                System.out.println("Inside finally try") ;
            }catch(ArithmeticException ae) {
                System.out.println("Inside finally catch") ;
            }
        }
    }
}