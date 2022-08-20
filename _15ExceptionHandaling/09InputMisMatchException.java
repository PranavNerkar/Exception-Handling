import java.util.Scanner; // Scanner ha Util Package madhla aahe

class Exception03 {
    public static void main(String[] Args) {
        Scanner sc  = new Scanner(System.in) ;
        int a = sc.nextInt() ;

        System.out.println(a) ;
    }
}
// jar input ha int dyacha asel pan aapn string dili tar hota

// Exception in thread "main" java.util.InputMismatchException
//         at java.base/java.util.Scanner.throwFor(Scanner.java:939)
//         at java.base/java.util.Scanner.next(Scanner.java:1594)
//         at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//         at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//         at Exception03.main(09InputMisMatchException.java:6)