package com.qa.tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeSScreenshot {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/mvndemo/src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com");


        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src ,new File("/Users/santoshsrinivas/Documents/mvndemo/src/test/java/com/qa/tests/google.png"));

    }
}
