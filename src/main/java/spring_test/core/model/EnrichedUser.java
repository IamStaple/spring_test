package spring_test.core.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "enriched_user")
public class EnrichedUser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "department")
    private String department;

    @Column(name = "last_updated")
    private String lastUpdated;

    protected EnrichedUser() {}

    public EnrichedUser(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.lastUpdated = builder.lastUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String email;
        private String department;
        private String lastUpdated;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder lastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        public EnrichedUser build() {
            return new EnrichedUser(this);
        }
    }

    public long getId() 
    {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getLastUpdated() {
        return this.lastUpdated;
    }
}
