package tutorials;

import java.io.*;
import java.util.Scanner;

public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("projectFiles/xanadu.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
                //Even though a scanner is not a stream, 
                //you need to close it to indicate that 
                //you're done with its underlying stream.
            }
        }
    }
}
