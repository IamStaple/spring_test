package spring_test.core.dto;

public class CompanyDTO {
    
    private String name;
    private String catchPhrase;
    public String bs;

    public CompanyDTO() {}

    public CompanyDTO(String name,
                      String catchPhrase,
                      String bs) 
    {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    public String getName() 
    {
        return this.name;
    }

    public String getCatchPhrase() 
    {
        return this.catchPhrase;
    }

    public String getBs() 
    {
        return this.bs;
    }
} 
