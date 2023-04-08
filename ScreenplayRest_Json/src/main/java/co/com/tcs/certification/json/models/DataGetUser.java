package co.com.tcs.certification.json.models;

import groovy.transform.builder.Builder;

@Builder
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddressObject() {
        return addressObject;
    }

    public void setAddressObject(Address addressObject) {
        this.addressObject = addressObject;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Company getCompanyObject() {
        return companyObject;
    }

    public void setCompanyObject(Company companyObject) {
        this.companyObject = companyObject;
    }
}
