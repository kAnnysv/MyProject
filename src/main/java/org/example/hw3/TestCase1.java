package org.example.hw3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TestCase1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://nekoshop.ru/");

        Thread.sleep(5000L);

        WebElement webElement1 = driver.findElement(By.cssSelector(".pages a[href='/category/all/']"));
        webElement1.click();

        Thread.sleep(3000L);





        WebElement webElement2 = driver.findElement(By.cssSelector(".chars a[href='/category/brjuki-na-zakaz-/']"));
        webElement2.click();

        Thread.sleep(3000L);

        WebElement webElement3 = driver.findElement(By.xpath(".//input[@value='14484']/following-sibling::button"));
        webElement3.click();

        WebElement webElement4 = driver.findElement(By.cssSelector(".added_cart"));
        webElement4.click();

        WebElement webElement5 = driver.findElement(By.xpath(".//input[@name='checkout']"));
        webElement5.click();


        //driver.quit();











    }


}
