class WithoutryCatch {
    public static void main(String[] arg) {
        System.out.println("Before Exception Occurs") ;
        WithoutryCatch obj = new WithoutryCatch() ;
        obj.fun() ;
        System.out.println("After Exception Occurs") ;
    }
    void fun() {
        System.out.println("In fun") ;
    }
}