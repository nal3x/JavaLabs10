import java.io.*;
public class ReadFromFile  {
    public static void main( String args[] ) {
            BufferedReader in;
            try {
                in = new BufferedReader(new FileReader("projectFiles/Data.txt"));

//                //Διάβασμα αρχείου χαρακτήρα- χαρακτήρα
//                while (in.ready()) { // Έλεγχος αν μπορεί να γίνει ανάγνωση από stream  
//                    char ch = (char) in.read();                     
//                    System.out.print( ch );
//                }
                
                String str;
                // Διάβασμα αρχείου ανά γραμμή
                while((str=in.readLine()) !=null) {                   
                    System.out.println( str );
                 }
                in.close();
            }
            catch ( FileNotFoundException e ) {
             System.out.println( "File not found" );
            }
            catch( IOException e ) {
                System.out.println( "Read error" );
            }
    }
           
}
