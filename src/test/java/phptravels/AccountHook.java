package phptravels;

import cucumber.api.java.After;
import phptravels.entities.Account;
import phptravels.entities.Context;
import phptravels.entities.Login;
import phptravels.ui.pages.AccountPage;

public class AccountHook {
    private Context context;
    private Account account;

    public AccountHook(Context context) {
        this.context = context;
        this.account = context.getAccount();
    }

    @After("@logout")
    public void afterScenario(){
        AccountPage accountPage = new AccountPage();
        accountPage.clickBody();
        accountPage.clickLogout();
    }
}
