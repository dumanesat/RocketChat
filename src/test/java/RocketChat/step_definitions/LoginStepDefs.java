package RocketChat.step_definitions;

import RocketChat.Pages.LoginPage;
import RocketChat.utilities.ConfigurationReader;
import RocketChat.utilities.Driver;
import io.cucumber.java.en.*;

public class LoginStepDefs {
LoginPage loginPage= new    LoginPage();
    @Given("User is on the Login Page")
    public void user_is_on_the_Login_Page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("User logs with valid credentials")
    public void user_logs_with_valid_credentials() {
       loginPage.nameBox.sendKeys(ConfigurationReader.get("username"));
       loginPage.passwordBox.sendKeys(ConfigurationReader.get("password"));
       loginPage.entrarButton.click();
    }

    @Then("User should be on home page")
    public void user_should_be_on_home_page() {
        System.out.println(Driver.get().getTitle());
    }
}
