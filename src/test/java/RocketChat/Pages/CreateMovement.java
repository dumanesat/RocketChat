package RocketChat.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.bind.annotation.W3CDomHandler;

public class CreateMovement extends BasePage {

    @FindBy(id = "tipo")
    public WebElement movementType;

   @FindBy(id= "data_transacao")
    public WebElement transactionDate;

    @FindBy(id= "data_pagamento")
    public WebElement payDay;

    @FindBy(id= "descricao")
    public WebElement description;

    @FindBy(id= "interessado")
    public WebElement interested;

    @FindBy(id= "valor")
    public WebElement valor;

    @FindBy(xpath = "//button[@type='submit' and @class='btn btn-primary']")
    public WebElement toSave;

    @FindBy(id= "conta")
    public WebElement account;

    @FindBy(id= "status_pendente")
    public WebElement pending;

    @FindBy(id= "status_pago")
    public WebElement payment;


@FindBy(id="getSuccesMessage")
 public WebElement getSuccesMessage;

}
