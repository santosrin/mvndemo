package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/mvndemo/src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.goibibo.com/");

        Actions actions = new Actions(driver);

        //Actions class please remember build and perform
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='padB10 lh1-2 iconText fmtTooltip']"))).build().perform();
        driver.findElement(By.linkText("Destinations")).click();

        driver.quit();
    }

}
