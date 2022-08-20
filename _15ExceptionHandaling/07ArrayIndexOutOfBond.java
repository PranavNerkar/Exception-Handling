class Exception02 {
    public static void main(String[] Args) {
        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(arr[3]) ; // 3 index cha nahi aahe tyamule exception deto
    }
    void fun() {
        System.out.println("In fun");
    }
}
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//         at Exception02.main(07IndexOutOfBox.java:8)