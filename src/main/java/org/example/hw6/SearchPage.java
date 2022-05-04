package org.example.hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends AbstractPage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".search_btn" )
    private WebElement search;

    @FindBy(css = "#search")
    private WebElement input;

    @FindBy(css = ".find")
    private WebElement enter;

    public SearchPage clicksearch(){
        search.click();
        return this;
    }
    public SearchPage inputstr(String value){
        input.sendKeys(value);
        return this;
    }
    public SearchPage clickenter(){
        enter.click();
        return this;
    }

}
