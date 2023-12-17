public class StoreContact {

    private String name;
    private PhoneNumber phone;
    private String email;

    public StoreContact(String name, PhoneNumber phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        
    }

    public StoreContact(String name, PhoneNumber phone) {
        this.name = name;
        this.phone = phone;
    }

    public StoreContact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void printContacts() {

        System.out.println("Name: " + this.name);
        System.out.println("Phone: " + this.phone);
        System.out.println("Email: " + this.email);
    }
}
