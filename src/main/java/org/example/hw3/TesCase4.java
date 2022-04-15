package org.example.hw3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TesCase4 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
//        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://nekoshop.ru/");

        //Thread.sleep(5000L);

        WebElement webElement1 = driver.findElement(By.cssSelector(".pages a[href='/category/all/']"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.cssSelector("a[href='/category/novinki/']"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.cssSelector("a[href='/delivery/']"));
        webElement3.click();

        WebElement webElement4 = driver.findElement(By.cssSelector("a[href='/page/otzyvy/']"));
        webElement4.click();

        WebElement webElement5 = driver.findElement(By.cssSelector("a[href='/news/']"));
        webElement5.click();

        WebElement webElement6 = driver.findElement(By.cssSelector("a[href='/shourum-v-moskve/']"));
        webElement6.click();

        WebElement webElement7 = driver.findElement(By.cssSelector("a[href='/faq/']"));
        webElement7.click();

        WebElement webElement8 = driver.findElement(By.cssSelector("a[href='/contacts/']"));
        webElement8.click();








    }
}
