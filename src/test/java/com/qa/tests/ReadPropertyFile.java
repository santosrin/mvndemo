package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

    static WebDriver driver;

    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        FileInputStream fs = new FileInputStream("/Users/santoshsrinivas/Documents/mvndemo/src/test/java/com/qa/tests/config.properties");
        prop.load(fs);

        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("age"));

        String url = prop.getProperty("URL");
        System.out.println(url);

        String browser = prop.getProperty("browser");
        System.out.println(browser);

        if(browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/mvndemo/src/main/resources/drivers/chromedriver");
            driver = new ChromeDriver();
        } else if(browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver","/Users/santoshsrinivas/Documents/mvndemo/src/main/resources/drivers/geckodriver");
            driver = new FirefoxDriver();
        }

        driver.get(url);
        driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
        driver.findElement(By.xpath(prop.getProperty("surname_xpath"))).sendKeys(prop.getProperty("surname"));
        driver.findElement(By.xpath(prop.getProperty("mobile_xpath"))).sendKeys(prop.getProperty("mobile"));
        driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
    }

}
