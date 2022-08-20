// NullPointer Exception
class TryCatch02 {
    int x = 10 ;
    public static void main(String[] args) {
        try {
            TryCatch02 obj = null ;
            //System.out.println(x) ; Cannot make a static reference to the non-static field x
            System.out.println(obj.x) ;
        } catch(NullPointerException obj) {
            System.out.println("Exception Handled") ;
        }
        System.out.println("After Try Catch") ;
    }
}
/* He chalta
catch(NullPointerException obj)
catch(RuntimeException obj)
catch(Exception obj)

he Chalat Nahi
*/