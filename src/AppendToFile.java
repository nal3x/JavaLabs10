import java.io.*;
import java.util.Scanner;

public class AppendToFile {
    public static void main( String args[] ) {
        BufferedWriter out;
        try {
           out = new BufferedWriter(new FileWriter("projectFiles/Data.txt", true));
           System.out.println("Enter text: ");
           BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
           
           String str = in.readLine();
           out.newLine();
           out.append(str);
           out.close();
        }
        catch( IOException e ) {
            System.out.println( "Write error" );
        }
    }
}
