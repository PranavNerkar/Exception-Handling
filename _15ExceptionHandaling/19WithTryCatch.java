class WithryCatch {
    public static void main(String[] arg) {
        System.out.println("Before Exception Occurs") ;
        WithryCatch obj = null ; // itha exception yeta
        try {
            obj.fun() ;
        }catch(NullPointerException obj1) { // Exception Catch kela
            // NullPointerException hya class chya jagi parent class jari lihila tari Chalta
        }
        System.out.println("After Exception Occurs") ;
    }
    void fun() {
        System.out.println("In fun") ;
    }
}