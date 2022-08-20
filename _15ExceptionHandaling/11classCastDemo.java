class Exception04 {
    public static void main(String[] Args){
        // The constructor Integer(int) has been deprecated since version 9 
        // and marked for removalJava(67110276)

        Object o = new Integer(10) ; //Object ha Integer cha Parent class Aahe
        String s = (String)o ; // o la String madhe Typecast karnyasathi
        // pan String aani Integer madhe relation nahi tyamule ClassCast exception yeta
    }
}

// Exception in thread "main" java.lang.ClassCastException 
// Description : java.lang.integer cannot cast to java.lang.String
//         at Exception04.main(Exception04.java:lineno.)