package phptravels;

import cucumber.api.java.After;
import phptravels.entities.Account;
import phptravels.entities.Context;
import phptravels.ui.pages.AccountPage;

/**
 * This class is used for defines the hooks of account.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class AccountHook {
    private Context context;
    private Account account;

    /**
     * This method is the constructor.
     *
     * @param context The parameter context defines a input context
     */
    public AccountHook(final Context context) {
        this.context = context;
        this.account = context.getAccount();
    }

    /**
     * This method is used for defines a hook for logout.
     */
    @After("@logout")
    public void afterScenario() {
        AccountPage accountPage = new AccountPage();
        accountPage.clickUserMenu();
        accountPage.clickLogout();
    }
}
