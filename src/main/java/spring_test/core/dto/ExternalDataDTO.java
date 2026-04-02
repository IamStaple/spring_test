package spring_test.core.dto;

public class ExternalDataDTO {
    
    private long id;
    private String name;
    private String username;
    private String email;
    
    private AddressDTO address;

    private String phone;
    private String website;

    private CompanyDTO company;

    public ExternalDataDTO() {}

    public ExternalDataDTO(long id,
                           String name,
                           String username,
                           String email,
                           AddressDTO address,
                           String phone,
                           String website,
                           CompanyDTO company) 
    {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }

    public long getId() 
    {
        return this.id;
    }

    public String getName() 
    {
        return this.name;
    }

    public String getUsername() {
        return this.username;
    }

    public String getEmail() 
    {
        return this.email;
    }

    public AddressDTO getAddress() 
    {
        return this.address;
    }

    public String getPhone() 
    {
        return this.phone;
    }

    public String getWebsite() 
    {
        return this.website;
    }

    public CompanyDTO getCompany() 
    {
        return this.company;
    }
}
