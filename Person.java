public class Person {
    private String ownername;
    private int contactnumber;

    Person(String ownername, int contactnumber) {
        setOwnername(ownername);
        setContactnumber(contactnumber);
    }
    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }
    public void setContactnumber(int contactnumber) {
        this.contactnumber = contactnumber;
    }
    public String getOwnername() {
        return ownername;
    }
    public int getContactnumber() {
        return contactnumber;
    }

    public void displayInfo(){
        System.out.println("Ownername: " + ownername + "\nContactnumber: " + contactnumber);
    }
}