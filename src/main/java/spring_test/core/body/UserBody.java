package spring_test.core.body;

public class UserBody {
    
    private String name;
    private String username;
    private String email;
    private String department;
    private String lastUpdated;

    public UserBody() {}

    public String getName() 
    {
        return this.name;
    }

    public String getUsername() 
    {
        return this.username;
    }

    public String getEmail() 
    {
        return this.email;
    }

    public String getDepartment() 
    {
        return this.department;
    }

    public String getLastUpdated() 
    {
        return this.lastUpdated;
    }
}
