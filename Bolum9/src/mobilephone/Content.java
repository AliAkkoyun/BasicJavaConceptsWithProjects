package mobilephone;

public class Content {
    private String name;
    private String phoneNumber;


    public Content(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static Content createContent(String name, String phoneNumber){
        return new Content(name,phoneNumber);
    }

}
