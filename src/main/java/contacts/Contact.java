package contacts;


public class Contact {
    private String name;
    private String emailAdress;
    private PhoneNumber phoneNumber;

    public Contact(String name,PhoneNumber phoneNumber, String emailAdress){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
    }

    public Contact(String name, PhoneNumber phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String emailAdress){
        this.name = name;
        this.emailAdress = emailAdress;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}
