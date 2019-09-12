package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import phptravels.ui.PageTransporter;

/**
 * This class is used for defines the steps of the scenarios.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class ManagerStepDefs {
    /**
     * This method configure the pre-requirements.
     *
     * @param url the parameter url defines a input string with the url.
     */
    @Given("I go the \"([^\"]*)\" page")
    public static void iGoTheLoginPage(final String url) {
        PageTransporter.goToUrl(url);
    }

}
