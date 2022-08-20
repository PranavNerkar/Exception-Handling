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
    static void weight_check(int x) {
        if (x > 50) {
            // throw new MYException("Weight Zasta zalay") ;
        }
    }
    public static void main(String[] args) {
        try {
            weight_check(51) ;
        } catch(/*MYException me*/) { 
            System.out.println("In Catch") ;
            System.out.println(/**/ ) ; // hi ethod object class chi aahe
            // 
        }
    }
}