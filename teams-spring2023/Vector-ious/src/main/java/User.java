import com.google.common.base.Objects;

public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    public User(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof User) || object == null) {
            return false;
        }
        
        User user = (User)object;
        return Objects.equal(firstName, user.firstName) &&
            Objects.equal(lastName, user.lastName) &&
            Objects.equal(username, user.username) &&
            Objects.equal(password, user.password);

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username, password);
    }

    //setters
    public void setFirstName(String givenFirstName) {
        this.firstName = givenFirstName;
    }

    public void setLastName(String givenLastName) {
        this.lastName = givenLastName;
    }

    public void setUserName(String givenUsername) {
        this.username = givenUsername;
    }

    public void setPassword(String givenPassword) {
        this.password = givenPassword;
    }

    //getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
    
}
