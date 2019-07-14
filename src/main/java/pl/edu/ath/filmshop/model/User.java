package pl.edu.ath.filmshop.model;

import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(notes = "The user id automatically generated", required = true)
    private String id;

    @Field
    @ApiModelProperty(notes = "The first name of the user", required = true)
    private String firstName;

    @Field
    @ApiModelProperty(notes = "The last name of the user", required = true)
    private String lastName;

    @Field
    @ApiModelProperty(notes = "The user's email", required = true)
    private String email;

    @Field
    @ApiModelProperty(notes = "The user's phone", required = true)
    private String phone;

    @Field
    @ApiModelProperty(notes = "The user's nick", required = true)
    private String nick;

    @Field
    @ApiModelProperty(notes = "The user's password", required = true)
    private String password;

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

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SortedSet<Type> getTypes() {
        return types;
    }

    public void setTypes(SortedSet<Type> types) {
        this.types = types;
    }
}
