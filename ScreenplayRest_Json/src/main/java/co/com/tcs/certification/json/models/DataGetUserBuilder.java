package co.com.tcs.certification.json.models;


import lombok.Builder;
import lombok.Data;

@Data
public class DataGetUserBuilder {
    private int id;
    private String name;
    private String username;
    private String email;
    private String street;
    private String suite;
    private String city;
    private String zipCode;
    private String lat;
    private String lng;
    private String phone;
    private String website;
    private String companyName;
    private String catchPhrase;
    private String bs;
    private Address address;
    private Company company;

    private Geo geo;




    public DataGetUser build() {
        return new DataGetUser(id, name, username, email, address, phone, website, company);
    }
}
