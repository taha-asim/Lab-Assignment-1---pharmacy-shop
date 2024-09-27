public class Address {
    private String street;
    private String city;
    private String postalCode;

    Address(String street, String city, String postalCode) {
        setStreet(street);
        setCity(city);
        setPostalCode(postalCode);
    }

    //Getters
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getPostalCode() {
        return postalCode;
    }

    //Setters
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    //Display Address
    public void displayInfo() {
        System.out.println("Street : " + street + "\nCity : " + city + "\nPostal Code : " + postalCode);
    }
}