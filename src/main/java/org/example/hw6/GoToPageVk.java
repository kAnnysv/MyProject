package org.example.hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoToPageVk extends AbstractPage{

    public GoToPageVk(WebDriver driver){super(driver);}

    @FindBy(css = "a[href='http://vk.com/nekoshopru']")
    private WebElement vk;

    public GoToPageVk clickvk(){
        vk.click();
        return this;
    }





}
