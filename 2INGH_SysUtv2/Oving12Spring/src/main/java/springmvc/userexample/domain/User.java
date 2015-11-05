package springmvc.userexample.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class User implements Serializable{
    
    @NotEmpty
    public String firstname;
    @NotEmpty
    public String lastname;
    @NotEmpty
    public String gender;
    @NotEmpty
    public String country;

    @NotNull
    public int age;
    @NotEmpty
    public String spam;
    @NotEmpty
    public String hobby;

    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpam() {
        return spam;
    }

    public void setSpam(String spam) {
        this.spam = spam;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString(){
        return firstname + ", " + lastname + ", " + gender + ", " + country + ", " + age + ", " + spam + ", " + hobby;
    }
}
