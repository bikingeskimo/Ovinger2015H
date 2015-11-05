
package springmvc.userexample.ui;

import springmvc.userexample.domain.User;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

public class UserForm {
    
    @Valid 
    private User user;

    public UserForm(){
        setUser(new User());//opprett bruker
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public List getCountryList(){
        String[] s = {"Norway","Greece","Sweden","England", "Denmark"};
        return Arrays.asList(s);
    }

    public List getHobbyList(){
        String[] s = {"Computers","Football","Bowling","Base Jumping", "Outdoors", "Hacking", "Rubiks cube"};
        return Arrays.asList(s);
    }
    
    public String toString(){
        return user.firstname + ", " + user.lastname + ", " + user.gender + ", " + user.country + ", " + user.age + ", " + user.spam + ", " + user.hobby;
    }
        
}
