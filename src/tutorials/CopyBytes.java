package tutorials;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    //low-level I/O that you should avoid.
    //all other stream types are built on byte streams
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("projectFiles/xanadu.txt");
            out = new FileOutputStream("projectFiles/outagain.txt");
            int c; //int variable holds a byte value in its last 8 bits.

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {//unable to open file if null
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}