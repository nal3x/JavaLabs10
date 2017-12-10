import java.io.Serializable;

class PhoneBook implements Serializable{ //serializable κλάση
    private String name;
    private String phone;

    public PhoneBook(String n, String p){
        this.name = n;
        this.phone = p;
    }

    public String toString (){
        return "the subscriber "+ this.name+ " has the number :"+this.phone;
      }
}