class Exception02 {
    public static void main(String[] Args) {
        String s = "Shashi" ;
        System.out.println(s.charAt(6)) ;
    }
}

// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 6
//         at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
//         at java.base/java.lang.String.charAt(String.java:711)
//         at Exception02.main(08stringIndexoutofBond.java:11)