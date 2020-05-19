package com.qa.tests;

import com.sun.xml.internal.ws.api.FeatureConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

    WebDriver driver;
    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/mvndemo/src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Hello World");
    }


}
