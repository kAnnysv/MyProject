package org.example.hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckLogin extends AbstractPage {

    public CheckLogin(WebDriver driver){super(driver);}

    @FindBy(css = ".not-visited")
    private WebElement stravtoriz;

    @FindBy(css = "input[name=login]")
    private WebElement login;

    @FindBy(css = "input[name=password]")
    private WebElement password;

    @FindBy(css = "input[value='Войти']")
    private WebElement enter;

    public CheckLogin clickavtor() {
        stravtoriz.click();
        return this;
    }

    public CheckLogin inputlogin(String value) {
        login.sendKeys(value);
        return this;
    }

    public CheckLogin inputpassword(String value) {
        password.sendKeys(value);
        return this;
    }

    public CheckLogin clickenter() {
        enter.click();
        return this;
    }


}
