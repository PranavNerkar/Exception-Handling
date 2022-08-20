import java.io.* ;

class TryCatch03 {
    int x = 10 ;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        try {
            System.out.println(br.readLine()) ;
            br.close() ; 
        }catch(IOException obj) {
            System.out.println("Exception Handled SuccessFully") ;
        }
    }
}