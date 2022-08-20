import java.io.* ;
// IOException
class TryCatch03 {
    int x = 10 ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        System.out.println(br.readLine()) ; // error
    }
}
// throws NullPointerException kela tar error yeto