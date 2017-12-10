package tutorials;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {
        
        /*FileReader uses FileInputStream, 
        while FileWriter uses FileOutputStream.
        */

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("projectFiles/xanadu.txt");
            outputStream = new FileWriter("projectFiles/characteroutput.txt");

            int c; //holds a character value in its last 16 bits
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
