package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    public WebDriver driver;

//    TC #1: Web table practice
// 1. Go to: https://practice.cydeo.com/web-tables

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" https://practice.cydeo.com/web-tables ");
    }

@Test
        public void order_name_verify_test() {

        //Locate the cell that has Bob Martin text in it
    WebElement bobMartinCell;
    bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

    System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());

//            2. Verify Bob’s name is listed as expected.
    

//    Expected: “Bob Martin”
//            3. Verify Bob Martin’s order date is as expected
//    Expected: 12/31/2021

}
}
