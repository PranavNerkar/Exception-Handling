class Core2web extends RuntimeException {
    // Core2web ha Throwable cha child asla tar to Exception class cha bro hoyel
    // tyamule tyala Specific RuntimeException Class cha child karayacha 
    // Jene karun to Arithmetic , nullpointer exception gheu shakto
    int x = 20 ;
}

class TryCatch02 {
    public static void main(String [] args) {
        try {
            System.out.println(10/0) ;
        }// catch(__){} kahich nahi lihila tar error : illegal start of type
        // catch(__){} ithe yenara class ha nehami Exception nchya hirarchy madhla pahije 

        // Core2web ha class throwable chya Hirarchy madhla pahize

        catch(Core2web C) {
            System.out.println("Handaling Code") ;
        }
    }
}