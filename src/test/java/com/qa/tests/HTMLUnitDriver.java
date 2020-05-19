package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

public class HTMLUnitDriver {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/mvndemo/src/main/resources/drivers/chromedriver");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new HtmlUnitDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.get("https://ui.freecrm.com/");

        System.out.println(driver.getTitle());

        driver.findElement(By.name("email")).sendKeys("santosh310184@yahoo.co.in");
        driver.findElement(By.name("password")).sendKeys("Ragh_1234");
        driver.findElement(By.className("ui fluid large blue submit button")).click();

        System.out.println(driver.getTitle());
    }
}
