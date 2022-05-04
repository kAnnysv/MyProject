package org.example.hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenu extends AbstractPage {

    @FindBy(css = ".pages a[href='/category/all/']" )
    private WebElement katalog;

    @FindBy(css = "a[href='/category/novinki/']")
    private WebElement novinki;

    @FindBy(css = "a[href='/delivery/']")
    private WebElement dostavka;

    @FindBy(css = "a[href='/page/otzyvy/']")
    private WebElement otzyvy;

    @FindBy(css = "a[href='/news/']")
    private WebElement novosty;

    @FindBy(css = "a[href='/shourum-v-moskve/']")
    private WebElement shourum;

    @FindBy(css = "a[href='/faq/']")
    private WebElement faq;

    @FindBy(css = "a[href='/contacts/']")
    private WebElement contacts;


    public MainMenu(WebDriver driver) {
        super(driver);
    }

    public MainMenu clickkatalog() {
        katalog.click();
        return this;
    }

    public MainMenu novinkiclick(){
        novinki.click();
        return this;
    }

    public MainMenu dostavkaclick(){
        dostavka.click();
        return this;
    }

    public MainMenu otzyvyclick(){
        otzyvy.click();
        return this;
    }

    public MainMenu novostyclick(){
        novosty.click();
        return this;
    }

    public MainMenu shourumclick(){
        shourum.click();
        return this;
    }

    public MainMenu faqclick(){
        faq.click();
        return this;
    }

    public MainMenu contactsclick(){
        contacts.click();
        return this;
    }








}
