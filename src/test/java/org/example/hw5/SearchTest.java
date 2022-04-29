package org.example.hw5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchTest extends AbstractTest {

    @Test
    void searchActiontest() throws InterruptedException{
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://nekoshop.ru/"));

        Actions search = new Actions(getDriver());

        search.click(getDriver().findElement(By.cssSelector(".search_btn")))
                .pause(1000l)
                .sendKeys(getDriver().findElement(By.cssSelector("#search")), "платья")
                .pause(1000l)
                .click(getDriver().findElement(By.cssSelector(".find")))
                .build()
                .perform();

//        getDriver().close();






    }






}
