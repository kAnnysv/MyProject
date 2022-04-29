package org.example.hw5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckLoginTest extends AbstractTest {

    @Test

    void test() throws InterruptedException{
        getDriver().get("https://nekoshop.ru/");
        Thread.sleep(5000);

        WebElement webElement1 = getDriver().findElement(By.cssSelector(".not-visited"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.cssSelector("input[name=login]"));
        webElement2.sendKeys("valeriisin@mail.ru");

        WebElement webElement3 = getDriver().findElement(By.cssSelector("input[name=password]"));
        webElement3.sendKeys("123");

        //Thread.sleep(5000L);

        WebElement webElement4 =getDriver().findElement(By.cssSelector("input[value='Войти']"));
        webElement4.click();

//        getDriver().close();

    }



}
