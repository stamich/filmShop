package pl.edu.ath.filmshop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.SortedSet;

@Document
public class User {

    public enum Type{
        UNREGISTERED,
        REGISTERED,
        ADMIN
    }

    @Id
    private String id;

    @Field
    private String firstName;

    @Field
    private String lastName;

    @Field
    private String email;

    @Field
    private String phone;

    @Field
    private SortedSet<Type> types;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public SortedSet<Type> getTypes() {
        return types;
    }

    public void setTypes(SortedSet<Type> types) {
        this.types = types;
    }
}
