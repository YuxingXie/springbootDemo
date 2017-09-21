package contacts;

import java.util.UUID;

/**
 * Created by xieyuxing on 2017/9/19.
 */
public class Contact {
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    public Contact(){
        this.setId(UUID.randomUUID().toString());
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
