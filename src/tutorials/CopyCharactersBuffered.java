package tutorials;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharactersBuffered {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        BufferedWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("projectFiles/xanadu.txt"));
            outputStream = new BufferedWriter(new FileWriter("projectFiles/characteroutput.txt"));

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

