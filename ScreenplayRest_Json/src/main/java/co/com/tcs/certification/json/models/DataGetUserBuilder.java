package co.com.tcs.certification.json.models;





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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public DataGetUserBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public DataGetUserBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public DataGetUserBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public DataGetUserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public DataGetUserBuilder withSuite(String suite) {
        this.suite = suite;
        return this;
    }

    public DataGetUserBuilder withStreet(String street) {
        this.street = street;
        return this;
    }

    public DataGetUserBuilder withCity(String suite) {
        this.city = suite;
        return this;
    }

    public DataGetUserBuilder withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public DataGetUserBuilder withLat(String lat) {
        this.lat = lat;
        return this;
    }

    public DataGetUserBuilder withLng(String lng) {
        this.lng = lng;
        return this;
    }

    public DataGetUserBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public DataGetUserBuilder withWebsite(String website) {
        this.website = website;
        return this;
    }

    public DataGetUserBuilder withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public DataGetUserBuilder withCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
        return this;
    }

    public DataGetUserBuilder withBs(String bs) {
        this.bs = bs;
        return this;
    }

    public DataGetUser build() {
        Address address = new Address(street, suite, city, zipCode, new Geo(lat, lng));
        Company company = new Company(companyName, catchPhrase, bs);
        return new DataGetUser(id, name, username, email, address, phone, website, company);
    }
}
