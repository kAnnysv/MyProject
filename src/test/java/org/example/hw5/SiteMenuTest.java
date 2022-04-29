package org.example.hw5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SiteMenuTest extends AbstractTest {

    @Test
    void test() throws InterruptedException {
        getDriver().get("https://nekoshop.ru/");
        Thread.sleep(3000);

        WebElement webElement1 = getDriver().findElement(By.cssSelector(".pages a[href='/category/all/']"));
        webElement1.click();
        Thread.sleep(3000);

        WebElement webElement2 = getDriver().findElement(By.cssSelector("a[href='/category/novinki/']"));
        webElement2.click();
        Thread.sleep(3000);


        WebElement webElement3 = getDriver().findElement(By.cssSelector("a[href='/delivery/']"));
        webElement3.click();
        Thread.sleep(3000);

        WebElement webElement4 = getDriver().findElement(By.cssSelector("a[href='/page/otzyvy/']"));
        webElement4.click();
        Thread.sleep(3000);

        WebElement webElement5 = getDriver().findElement(By.cssSelector("a[href='/news/']"));
        webElement5.click();
        Thread.sleep(3000);

        WebElement webElement6 = getDriver().findElement(By.cssSelector("a[href='/shourum-v-moskve/']"));
        webElement6.click();
        Thread.sleep(3000);

        WebElement webElement7 = getDriver().findElement(By.cssSelector("a[href='/faq/']"));
        webElement7.click();
        Thread.sleep(3000);

        WebElement webElement8 = getDriver().findElement(By.cssSelector("a[href='/contacts/']"));
        webElement8.click();

        getDriver().close();

    }
}
