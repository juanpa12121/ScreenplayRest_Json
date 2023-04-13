package co.com.tcs.certification.json.models;


import lombok.Data;

@Data
public class DataGetUser {
    private int id;
    private String name;
    private String username;
    private String email;
    Address addressObject;
    private String phone;
    private String website;
    Company companyObject;

    public DataGetUser(int id, String name, String username, String email, Address addressObject, String phone, String website, Company companyObject) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.addressObject = addressObject;
        this.phone = phone;
        this.website = website;
        this.companyObject = companyObject;
    }
}
