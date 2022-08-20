class ExceptionHandaling01 {
    public static void main(String[] arg) {
        System.out.println("In Main");
        fun();
        System.out.println("In Main - after fun");
    }

    // void fun() {} // error can not make static reference from nonstatic method
    // fun()
    static void fun() {
        System.out.println("In Fun");
        gun();
        System.out.println("In Fun - after gun");
    }

    static void gun() {
        System.out.println("In gun");
        System.out.println(10 / 0);
        /*
         * Exception in thread "main" java.lang.ArithmeticException: / by zero
         * at ExceptionHandaling01.gun(02ExceptionHandaling.java:18)
         * at ExceptionHandaling01.fun(02ExceptionHandaling.java:12)
         * at ExceptionHandaling01.main(02ExceptionHandaling.java:4)
         */
    }
}