class Biencaps {
    void products() {
        System.out.println("In Fun") ;
    }
}
class MultipleTryCatch {
    public static void main(String [] args) {
        System.out.println("Statement 01") ;
        try {
            System.out.println("Statement 02") ;
            System.out.println(10/0) ;
            System.out.println("Statement 03") ;
        } catch(ArithmeticException ae) { // je Exception yenar aahe tech lihayacha
            System.out.println("Statement 04") ;
        }
        System.out.println("Statement 05") ;
        try {
            System.out.println("Statement 06") ;
            Biencaps obj = new Biencaps() ; ;
            obj.products() ;
            System.out.println("Statement 07") ;
        } catch(NullPointerException np) { // je Exception yenar aahe tech lihayacha
            System.out.println("Statement 08") ;
        }
        System.out.println("Statement 09") ;
    }
}
// if no Exception
/*  
    Statement 01
    Statement 02
    Statement 03
    Statement 05 
*/

// System.out.println(10/0) ;
// catch(ArithmeticException ae) , catch(RuntimeException ae) , catch(Exception ae)
/*
    Statement 01
    Statement 02
    Statement 04
    Statement 05
*/

// if no Exception
/*  
    Statement 06
    Statement 07
    Statement 09    
*/

// System.out.println(10/0) ;
// catch(ArithmeticException ae) , catch(RuntimeException ae) , catch(Exception ae)
/*
    Statement 01
    Statement 02
    Statement 04
    Statement 05
*/