package org.example.hw3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TestCase3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://nekoshop.ru/");

        Thread.sleep(5000L);

        WebElement webElement1 = driver.findElement(By.cssSelector(".not-visited"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.cssSelector("input[name=login]"));
        webElement2.sendKeys("valeriisin@mail.ru");

        WebElement webElement3 = driver.findElement(By.cssSelector("input[name=password]"));
        webElement3.sendKeys("123");

        //Thread.sleep(5000L);

        WebElement webElement4 = driver.findElement(By.cssSelector("input[value='Войти']"));
        webElement4.click();

        //driver.quit();
























    }
}
