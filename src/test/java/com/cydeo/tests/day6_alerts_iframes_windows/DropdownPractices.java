package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //        1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //        2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown ");
    }

    @Test
    public void dropdown_tasks5() throws InterruptedException {

//        TC #5: Selecting state from State dropdown and verifying result

        //we locate the dropdown and it is ready to use
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

//        3. Select Illinois
        stateDropdown.selectByVisibleText("Illinois");

//        4. Select Virginia
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

//        5. Select California
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);

//        6. Verify final selected option is California.
        String expectionOptionTex = "California";
        String actualOptionText= stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOptionText,expectionOptionTex);

//        Use all Select options. (visible text, value, index)
    }

    @Test
    public void dropdown_task6() {

    }


}
