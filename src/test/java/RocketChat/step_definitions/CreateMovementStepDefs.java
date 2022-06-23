package RocketChat.step_definitions;

import RocketChat.Pages.CreateMovement;
import RocketChat.Pages.LoginPage;
import RocketChat.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class CreateMovementStepDefs {
CreateMovement createMovement = new CreateMovement();

    @Given("User Logs in")
    public void user_Logs_in() {
       new LoginPage().login();
    }

    @When("User navigates to {string} page")
    public void user_navigates_to_page(String tab) {
        createMovement.navigateTo(tab);

    }

    @When("User fills required fields and create movement")
    public void user_fills_required_fields_and_create_movement() {

        Select select= new Select(createMovement.movementType);
        select.selectByIndex(0);
        createMovement.transactionDate.sendKeys("21/06/2022");
        createMovement.payDay.sendKeys("21/06/2022");
        createMovement.description.sendKeys("payment");
        createMovement.interested.sendKeys("leasing");
        createMovement.valor.sendKeys("1000");
        new Select(createMovement.account).selectByIndex(1);
        createMovement.payment.click();
        createMovement.toSave.click();




    }

    @Then("User gets {string} message")
    public void user_gets_message(String succesMessage) {
        Assert.assertEquals(succesMessage,createMovement.getSuccesMessage.getText());
    }

}
