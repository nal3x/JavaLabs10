import java.io.*;
public class ObjectWrite { // εγγραφή αντικειμένων σε αρχείο

    public static void main(String[] args) {
        ObjectOutputStream out;
        int array[] = {1,4,5,8};
        try {
            out=new ObjectOutputStream(new FileOutputStream("projectFiles/object.txt"));

            out.writeObject(array);
            out.writeObject("abc");
            out.writeObject(new PhoneBook("Nikos", "2273012345"));
            out.writeObject(new PhoneBook("Mixalis", "2273054321"));
            out.flush();
            out.close();

            System.out.println("Object written to file");
        }
        catch (FileNotFoundException ex) {
            System.out.println("Error with specified file") ;
            ex.printStackTrace();
        }
        catch (IOException ex) {
            System.out.println("Error with I/O processes") ;
            ex.printStackTrace();
        }
    }
}