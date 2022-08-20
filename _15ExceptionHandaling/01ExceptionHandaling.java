class ExceptionHandaling {
    void show() {
        
    }
    public static void main(String[] arg) {
        System.out.println("In Main");
        fun();
        System.out.println("In Main - after fun");

        // to access non-static method we have to create an object of class
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
    }
}
/*
 * In main
 * In fun
 * in gun
 * IN fun - after Gun
 * in main- after fun
 */