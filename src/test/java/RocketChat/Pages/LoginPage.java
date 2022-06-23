package RocketChat.Pages;

import RocketChat.utilities.ConfigurationReader;
import RocketChat.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//input[@id='email']")
    public WebElement nameBox;


    @FindBy(xpath = "//input[@id='senha']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Entrar']")
    public WebElement entrarButton;

public void login(){
    Driver.get().get(ConfigurationReader.get("url"));
   nameBox.sendKeys(ConfigurationReader.get("username"));
   passwordBox.sendKeys(ConfigurationReader.get("password"));
   entrarButton.click();

}


}
