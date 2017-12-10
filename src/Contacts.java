import java.io.*;

public class Contacts {
    public static void main (String [] args) {
        boolean prostheseEpafi = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out;

        try {
            out = new BufferedWriter(new FileWriter("projectFiles/contacts.txt"));
            while(prostheseEpafi) {
                System.out.print("Enter name: ");
                String name=br.readLine();

                System.out.print("Enter surname: ");
                String lastname=br.readLine();

                System.out.print("Enter mobile phone: ");
                String mobile=br.readLine();

                System.out.print("Enter land line phone: ");
                String landline=br.readLine();

                out.write(name+" "+lastname+" "+mobile+" "+landline);
                out.newLine();

                System.out.print("If you want to enter another contact enter yes.\nIf you don't, enter no: ");
                String answer=br.readLine();
                
                if(!answer.equals("yes")) prostheseEpafi=false;   
                
                out.flush(); // Αδειάζει όλα τα περιεχόμενα του stream
                out.close();
            }   

        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("Output error");
        }
    }
}
