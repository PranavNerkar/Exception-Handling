class InteruptedExcept {
    public static void main(String [] args) throws InterruptedException{
        Thread t = new Thread() ;
        t.start() ;
        System.out.println("Core2web") ;
        t.sleep(5000) ; // hyamule exeption yeta
    //    .\15InteruptedExcept.java:6: error: unreported exception InterruptedException; must be caught or declared to be thrown
    //    t.sleep(5000) ;
    //           ^
    //    1 error
        System.out.println("Biencaps") ;
    }
}
// sleep navachi method hi thread navachya class chi aahe
// t.sleep(5000) ; 5 second nantar pudhchi line print honar