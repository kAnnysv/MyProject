package org.example.hw5;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AuthorizationTest extends AbstractTest {

    @Test

    void test() throws InterruptedException{
        getDriver().get("https://nekoshop.ru/");
        Thread.sleep(5000);
        WebElement webElement = getDriver().findElement(By.cssSelector(".not-visited"));
        webElement.click();


        WebElement webElement1 = getDriver().findElement(By.cssSelector(".wa-signup-url a"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.cssSelector("input[name='data[firstname]'"));
        webElement2.sendKeys("Val");

        WebElement webElement4 = getDriver().findElement(By.cssSelector("input[name='data[lastname]'"));
        webElement4.sendKeys("Sin");

        WebElement webElement5 = getDriver().findElement(By.cssSelector("input[name='data[email]'"));
        webElement5.sendKeys("tit@ya.ru");

        WebElement webElement6 = getDriver().findElement(By.cssSelector("input[name='data[password]'"));
        webElement6.sendKeys("123");

        WebElement webElement7 = getDriver().findElement(By.cssSelector("input[name='data[password_confirm]'"));
        webElement7.sendKeys("123");

        WebElement webElement8 = getDriver().findElement(By.xpath(".//input[@value='Регистрация']"));
        webElement8.click();

//        getDriver().close();


    }


}
