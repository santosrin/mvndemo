package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/mvndemo/src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://html.com/input-type-file/");
        driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/Users/santoshsrinivas/Downloads/key.pdf");
    }
}
