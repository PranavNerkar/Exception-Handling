// Arithmatic Exception
class Tryruntime {
    public static void main(String[] arg) {
        try {
            System.out.println(10/0) ;            
        }catch(NullPointerException obj) { // Exact Match sapadto
            System.out.println("Exception handled Sussessfully") ;
        }
        System.out.println("After try catch") ;
    }
}
/* he Chalta
catch(ArithmeticException obj)
catch(RuntimeException obj)
catch(Exception obj)

pan he nahi chalat
catch(NullPointerException obj)
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Tryruntime.main(23TryCatch01.java:4)
*/