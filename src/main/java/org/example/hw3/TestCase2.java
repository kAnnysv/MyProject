package org.example.hw3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TestCase2 {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://nekoshop.ru/");
        Thread.sleep(5000L);


        WebElement webElement1 = driver.findElement(By.cssSelector(".not-visited"));
        webElement1.click();
        Thread.sleep(5000L);

        WebElement webElement2 = driver.findElement(By.cssSelector(".wa-signup-url a"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.cssSelector("input[name='data[firstname]'"));
        webElement3.sendKeys("Val");

        WebElement webElement4 = driver.findElement(By.cssSelector("input[name='data[lastname]'"));
        webElement4.sendKeys("Sin");

        WebElement webElement5 = driver.findElement(By.cssSelector("input[name='data[email]'"));
        webElement5.sendKeys("tit@ya.ru");

        WebElement webElement6 = driver.findElement(By.cssSelector("input[name='data[password]'"));
        webElement6.sendKeys("123");

        WebElement webElement7 = driver.findElement(By.cssSelector("input[name='data[password_confirm]'"));
        webElement7.sendKeys("123");

        WebElement webElement8 = driver.findElement(By.xpath(".//input[@value='Регистрация']"));
        webElement8.click();


        //driver.quit();








    }

}
