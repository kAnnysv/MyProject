package org.example.hw5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoToPageVkTest extends AbstractTest{

    @Test

    void test() throws InterruptedException {

        getDriver().get("https://nekoshop.ru/");
        Thread.sleep(5000);

        WebElement webElement = getDriver().findElement(By.cssSelector("a[href='http://vk.com/nekoshopru']"));
        webElement.click();

//        getDriver().close();

    }

}
