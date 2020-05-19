package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandleWindowPopup {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/mvndemo/src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

        driver.get("http://www.popuptest.com/goodpopups.html");

        driver.findElement(By.xpath("//a[@class='black']")).click();

        Thread.sleep(2000);

        Set<String> handler = driver.getWindowHandles();

        Iterator<String> it = handler.iterator();
        String parentWindowId = it.next();
        System.out.println(parentWindowId);

        String childtWindowId = it.next();
        System.out.println(childtWindowId);

        driver.switchTo().window(childtWindowId);

        Thread.sleep(2000);

        System.out.println("child window pop-up title"+ driver.getTitle());

        driver.close();

        driver.switchTo().window(parentWindowId);
        Thread.sleep(2000);

        System.out.println("parent window title"+ driver.getTitle());
    }
}
