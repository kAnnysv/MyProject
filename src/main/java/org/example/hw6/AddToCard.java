package org.example.hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCard extends AbstractPage {

    public AddToCard(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".pages a[href='/category/all/']")
    private WebElement katolog;

    @FindBy(css = ".chars a[href='/category/brjuki-na-zakaz-/']")
    private WebElement brjuki;

    @FindBy(xpath = ".//input[@value='14484']/following-sibling::button")
    private WebElement zakaz;

    @FindBy(css = ".added_cart")
    private WebElement korzina;

    @FindBy(xpath = ".//input[@name='checkout']")
    private WebElement oformit;

    public AddToCard clickkatolog(){
        katolog.click();
        return this;
    }

    public AddToCard clickbrjuki(){
        brjuki.click();
        return this;
    }


    public AddToCard clickzakaz(){
        zakaz.click();
        return this;

    }


    public AddToCard clickkorzina(){
        korzina.click();
        return this;

    }


    public AddToCard clickoformit(){
        oformit.click();
        return this;

    }

}
