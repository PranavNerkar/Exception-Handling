import java.io.* ;
// IOException
class TryCatch03 {
    int x = 10 ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        System.out.println(br.readLine()) ;
        br.close() ; // br stream hi close zali
        // System.out.println(br.readLine()) ; itha Exception Yenar
        try{       
            System.out.println(br.readLine()) ; // he Runtime la yenar
        } catch(IOException obj) {
            System.out.println("Buffered Stream Already closed") ;
        }
    }
}