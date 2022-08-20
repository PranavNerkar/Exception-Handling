class Core2web extends RuntimeException {
    int x = 20 ;
}

class TryCatch02 {
    public static void main(String [] args) {
        System.out.println("Before Exception") ;
        try {
            System.out.println(10/0) ;
        } catch(Core2web C) { // ArithmaticException sapadto nasel tar Default Exception Handlar jvm kadun aalela Stacktraced Waparto
            System.out.println("Handaling Code") ;
        }
        System.out.println("After Exception") ;
    }
}