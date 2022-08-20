class MYException extends Exception {
    String msg = null ;
    MYException(String s ){
        msg = s ;
    }
    public String toString () { 
        return msg ;
    }
}
class CustamizedException {
    public static void main(String[] args) {
        try {
            System.out.println("In Try") ;
            throw new MYException("Custamized Exception") ; // ha msg print karnyasathi
        } catch(MYException me) { 
            System.out.println("In Catch") ;
            System.out.println(me.toString()) ; // hi ethod object class chi aahe
            // 
        }
    }
}