package com.cydeo.tests;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSExecuter {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
    @Test
    public void scrollingTest() throws InterruptedException {

       driver.get("http://practice.cydeo.com/");

        WebElement cydeoLink = driver.findElement(By.linkText("CYDEO"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true);",cydeoLink);
        Thread.sleep(3000);
        js.executeScript("arguments[0].click();", cydeoLink);

        }



}
