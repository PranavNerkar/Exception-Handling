class WithException {
    public static void main(String[] arg) {
        System.out.println("Before Exception Occurs") ;
        WithException obj = null ; 

        obj.fun() ;// itha exception yeta
        System.out.println("After Exception Occurs") ;
    }
    void fun() {
        System.out.println("In fun") ;
    }
}
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "WithException.fun()" because "<local1>" is null
//         at WithException.main(18Withtrycatch.java:5)