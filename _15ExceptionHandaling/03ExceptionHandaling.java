class ExceptionHandaling02 {
    public static void main(String[] arg) {
        System.out.println("In Main");

        ExceptionHandaling02 obj = null;// new ExceptionHandaling02();
        obj.fun(); // yello yetamhanun
        /*
         * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
         * "ExceptionHandaling02.fun()" because "<local1>" is null
         * at ExceptionHandaling02.main(03ExceptionHandaling.java:6)
         */

        // object ne call kela non static method la
        System.out.println("In Main - after fun");
    }

    void fun() { // Static kadhla
        System.out.println("In Fun");
        gun();
        System.out.println("In Fun - after gun");
    }

    static void gun() {
        System.out.println("In gun");
        System.out.println(10 / 0);
    }
}

// nonstatic madhe static nonstatic chalta ;
// static madhe static chalta (Nonstatic chalnya sathi object banvava lagto);