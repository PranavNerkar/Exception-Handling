import java.io.* ;

class FileNotFound {
    public static void main (String [] args) throws FileNotFoundException { // handle kela
        File f = new File("Core2web.txt") ;
        FileInputStream fis = new FileInputStream(f) ; // Core2web.txt hi file wach
        // nasel tar exception deto
    //   error: unreported exception FileNotFoundException; must be caught or declared to be thrown  
    //   FileInputStream fis = new FileInputStream(f) ; // Core2web.txt hi file wach
    //                         ^
    // 1 error
    }
}
// aata Compile kelyavar exception gela pan runtime la aala

// Exception in thread "main" java.io.FileNotFoundException: Core2web.txt (The system cannot find the file specified)   
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:211)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:153)
//         at FileNotFound.main(14FileNotFound.java:6)