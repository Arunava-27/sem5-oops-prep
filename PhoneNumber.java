public class PhoneNumber {
    
    private String phoneNumber;
    private int countryCode;

    public PhoneNumber(String phoneNumber, int countryCode) {
        this.phoneNumber = phoneNumber;
        this.countryCode = countryCode;
    }

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns a string representation of the PhoneNumber object.
     * If the country code is 0, it returns the phone number without the country code.
     * If the country code is not 0, it returns the phone number with the country code.
     *
     * @return a string representation of the PhoneNumber object
     */
    public String toString() {
        if (this.countryCode == 0) {
            return this.phoneNumber;
        } else {
            return "+" + this.countryCode + " " + this.phoneNumber;
        }
    }
}
