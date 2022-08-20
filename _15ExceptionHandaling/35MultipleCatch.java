import java.io.* ;

class MultipleCatch {
    public static void main(String [] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        try {
            System.out.println("10/0") ;
            br.close() ;
            System.out.println(br.readLine()) ;
        }catch(ArithmeticException Ae) {
            System.out.println("Arithmetic Exception") ;
        }catch(IOException IO) {
            System.out.println("IOException") ;
        }
    }
}
// System.out.println(br.readLine()) ; try madhe fakta asa lihila tar error : 
// Unhandled Exception Type IOException