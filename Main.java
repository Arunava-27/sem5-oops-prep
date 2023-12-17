public class Main {
    public static void main(String[] args) {
        PhoneNumber phone1 = new PhoneNumber("1234567890", 1);
        phone1.toString();
        PhoneNumber phone2 = new PhoneNumber("1234567890");
        phone2.toString();
        StoreContact contact1 = new StoreContact("John", phone1, "dra@dra.com");
        StoreContact contact2 = new StoreContact("John", phone2);
        StoreContact contact3 = new StoreContact("John", "lulu@lu.com");

        contact1.printContacts();
        contact2.printContacts();
        contact3.printContacts();
    }
}
