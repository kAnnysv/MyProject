package org.example.hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinePageTest extends AbstractTest{

    @Test

    void mainMenuNavigationTest() throws InterruptedException {
        MainMenu mainMenu = new MainMenu(getWebDriver());
        mainMenu.clickkatalog();

        mainMenu.novinkiclick();
        Thread.sleep(3000l);
        mainMenu.dostavkaclick();
        Thread.sleep(3000l);
        mainMenu.otzyvyclick();
        Thread.sleep(3000l);
        mainMenu.novostyclick();
        Thread.sleep(3000l);
        mainMenu.shourumclick();
        Thread.sleep(3000l);
        mainMenu.faqclick();
        Thread.sleep(3000l);
        mainMenu.contactsclick();
        Thread.sleep(3000l);
        Assertions.assertEquals("https://nekoshop.ru/contacts/", getWebDriver().getCurrentUrl());
    }

    @Test

    void searchTest() throws InterruptedException {
        SearchPage searchPage =new SearchPage(getWebDriver());
        Thread.sleep(3000l);
        searchPage.clicksearch();
        Thread.sleep(3000l);
        searchPage.inputstr("платья");
        searchPage.clickenter();
        Assertions.assertTrue(getWebDriver().getCurrentUrl().contains("https://nekoshop.ru/search/?query=%D0%BF%D0%BB%D0%B0%D1%82%D1%8C%D1%8F"));


    }
    @Test

    void addToCardTest() throws InterruptedException {
        AddToCard addToCard = new AddToCard(getWebDriver());
        addToCard.clickkatolog();
        Thread.sleep(3000l);
        addToCard.clickbrjuki();
        Thread.sleep(3000l);
        addToCard.clickzakaz();
        Thread.sleep(3000l);
        addToCard.clickkorzina();
        addToCard.clickoformit();
        Thread.sleep(3000l);
        Assertions.assertEquals("https://nekoshop.ru/checkout/", getWebDriver().getCurrentUrl());


    }

    @Test

    void authorizationTest() throws InterruptedException {
        Authorization authorization = new Authorization(getWebDriver());
        authorization.clickreg();
        Thread.sleep(3000l);
        authorization.clickpolevvoda();
        Thread.sleep(5000l);
        authorization.inputname("Kjd");
        authorization.inputsurname("fggh");
        authorization.inputemail("rey@eo.ru");
        authorization.passw1("123");
        authorization.passw2("123");
        authorization.enter();
        Assertions.assertEquals("https://nekoshop.ru/signup/", getWebDriver().getCurrentUrl());


    }

    @Test

    void checkLoginTest() throws InterruptedException {

        CheckLogin checkLogin = new CheckLogin(getWebDriver());
        Thread.sleep(3000l);
        checkLogin.clickavtor();
        Thread.sleep(5000l);
        checkLogin.inputlogin("valeriisin@mail.ru");
        checkLogin.inputpassword("123");
        checkLogin.clickenter();
        Assertions.assertEquals("https://nekoshop.ru/my/orders/", getWebDriver().getCurrentUrl());

    }

    @Test

    void govkTest() throws InterruptedException {
        GoToPageVk goToPageVk = new GoToPageVk(getWebDriver());
        Thread.sleep(3000l);
        goToPageVk.clickvk();
        Thread.sleep(3000l);
        Assertions.assertEquals("https://vk.com/nekoshopru", getWebDriver().getCurrentUrl());

    }








}
