package org.example.hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authorization extends AbstractPage {

    public Authorization(WebDriver driver){super(driver);}

    @FindBy(css = ".not-visited")
    private WebElement registraciy;

    @FindBy(css = ".wa-signup-url a")
    private WebElement polevvoda;

    @FindBy(css = "input[name='data[firstname]'")
    private WebElement name;

    @FindBy(css = "input[name='data[lastname]'")
    private WebElement surname;

    @FindBy(css = "input[name='data[email]'")
    private WebElement email;

    @FindBy(css = "input[name='data[password]'")
    private WebElement passw1;

    @FindBy(css = "input[name='data[password_confirm]'")
    private WebElement passw2;

    @FindBy(xpath = ".//input[@value='Регистрация']")
    private WebElement enter;

    public Authorization clickreg(){
        registraciy.click();
        return this;
    }

    public Authorization clickpolevvoda(){
        polevvoda.click();
        return this;
    }

    public Authorization inputname(String value){
        name.sendKeys(value);
        return this;
    }
    public Authorization inputsurname(String value){
        surname.sendKeys(value);
        return this;
    }
    public Authorization inputemail(String value){
        email.sendKeys(value);
        return this;
    }

    public Authorization passw1(String value){
        passw1.sendKeys(value);
        return this;
    }
    public Authorization passw2(String value){
       passw2.sendKeys(value);
        return this;
    }

    public Authorization enter(){
        enter.click();
        return this;
    }


}
