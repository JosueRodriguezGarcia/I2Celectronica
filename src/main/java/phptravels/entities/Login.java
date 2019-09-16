package phptravels.entities;

/**
 * Login class.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class Login {
    private String email;
    private String password;

    /**
     * this method is used for get a Email.
     *
     * @return an Email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method is used for set an email.
     *
     * @param email defines a input string with the email.
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * This method is used for get the password.
     *
     * @return a string with the password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method is used for set the password.
     *
     * @param password defines a input string with the password.
     */
    public void setPassword(final String password) {
        this.password = password;
    }
}
