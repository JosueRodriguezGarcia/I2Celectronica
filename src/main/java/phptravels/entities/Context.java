package phptravels.entities;

/**
 * Context class.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class Context {
    private Login login;
    private Account account;

    /**
     * This method is the constructor.
     */
    public Context() {
        this.login = new Login();
        this.account = new Account();
    }

    /**
     * This methos is used for get a Login.
     *
     * @return a Login.
     */
    public Login getLogin() {
        return login;
    }

    /**
     * This method is used for set a Login.
     * @param login defines a input Login.
     */
    public void setLogin(final Login login) {
        this.login = login;
    }

    /**
     * This method is used for get a Account.
     *
     * @return an Account.
     */
    public Account getAccount() {
        return account;
    }

    /**
     * This method is used set a Account.
     *
     * @param account a defines a input Account.
     */
    public void setAccount(final Account account) {
        this.account = account;
    }
}
