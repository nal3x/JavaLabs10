import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    public static void main( String args[] ) {
        BufferedWriter out;
        try {
           out = new BufferedWriter(new FileWriter("projectFiles/Data.txt"));
           System.out.println("Enter text: ");
           BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
           
           String str = in.readLine();
            //Scanner in = new Scanner (System.in);
            //String str = in.nextLine();row4
            

            out.write(str, 0, str.length());  
            //str = String to be written,
            //0 Offset from which to start reading characters
            //str.length() - Number of characters to be written
             //out.write(str);
            
            out.close();
        }
        catch( IOException e ) {
            System.out.println( "Write error" );
        }
    }
}
