import java.io.* ;

class finally02 {
    public static void main(String [] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in) ;
        BufferedReader br = new BufferedReader(isr) ;
        try {
            System.out.println("In Try") ;
            System.out.println(br.readLine()) ;
        } catch(IOException Ae) {
            System.out.println("In Catch") ;
        } finally {
            System.out.println("in finally") ;
            br.close() ;
        }// finally ha block ekdach lihita yeto
    }
}