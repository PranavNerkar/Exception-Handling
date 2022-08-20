class Exception02 {
    public static void main(String[] Args) {
        Exception02 obj = null; // new Exception02()
        obj.fun();
    }

    void fun() {
        System.out.println("In fun");
    }
}
// Exception in thread "main" java.lang.NullPointerException: Cannot invok
// "Exception02.fun()" because "<local1>" is null
// at Exception02.main(06NullPointerDemo.java:4)