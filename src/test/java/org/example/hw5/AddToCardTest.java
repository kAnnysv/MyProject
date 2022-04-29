package org.example.hw5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddToCardTest extends AbstractTest {

    @Test

    void test() throws InterruptedException{

        getDriver().get("https://nekoshop.ru/");
        Thread.sleep(5000);

        WebElement webElement1 = getDriver().findElement(By.cssSelector(".pages a[href='/category/all/']"));
        webElement1.click();

        Thread.sleep(3000L);

        WebElement webElement2 = getDriver().findElement(By.cssSelector(".chars a[href='/category/brjuki-na-zakaz-/']"));
        webElement2.click();

        Thread.sleep(3000L);

        WebElement webElement3 = getDriver().findElement(By.xpath(".//input[@value='14484']/following-sibling::button"));
        webElement3.click();

        WebElement webElement4 = getDriver().findElement(By.cssSelector(".added_cart"));
        webElement4.click();

        WebElement webElement5 = getDriver().findElement(By.xpath(".//input[@name='checkout']"));
        webElement5.click();

//        getDriver().close();



    }


}
