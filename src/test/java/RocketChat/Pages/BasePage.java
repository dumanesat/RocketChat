package RocketChat.Pages;

import RocketChat.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    public void navigateTo(String tabName){
        Driver.get().findElement(By.xpath("//a[.='"+tabName+"']")).click();
    }

}
