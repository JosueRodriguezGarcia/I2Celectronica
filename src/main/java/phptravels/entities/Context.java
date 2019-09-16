package phptravels.entities;

public class Context {
    private Login login;
    private Account account;

    public Context() {
        this.login = new Login();
        this.account = new Account();
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(final Login login) {
        this.login = login;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(final Account account) {
        this.account = account;
    }
}
