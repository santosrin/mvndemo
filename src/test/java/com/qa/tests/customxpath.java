package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customxpath {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/mvndemo/src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.ebay.com");

        //driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");

        //contains , starts-with, ends-with "//input[]"
        driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Java");
//        driver.findElement(By.xpath("//input[starts-with(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("JS");
//        driver.findElement(By.xpath("//input[ends-with(@class,'-autocomplete-input')")).sendKeys("VB");

        //for links - all links html tag will be 'a'
        driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();

    }

}
