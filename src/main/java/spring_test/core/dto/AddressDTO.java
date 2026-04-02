package spring_test.core.dto;

public class AddressDTO {
    
    private String street;
    private String suite;
    private String city;
    private String zipCode;
    
    private GeoDTO geo;

    public AddressDTO() {}

    public AddressDTO(String street,
                      String suite,
                      String city,
                      String zipCode,
                      GeoDTO geo) 
    {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipCode = zipCode;
        this.geo = geo;
    }

    
    public String getStreet() 
    {
        return this.street;
    }

    public String getSuite() 
    {
        return this.suite;
    }

    public String getCity() 
    {
        return this.city;
    }

    public String getZipCode() 
    {
        return this.zipCode;
    }

    public GeoDTO getGeo() 
    {
        return this.geo;
    }
}
