package com.cydeo.tests.day3_sccSelector_xpath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

//        TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/ ");


//        3- Verify “Log in” button text is as expected:
//        Expected: Log In
        //  WebElement signInButton = driver.findElement(By.className("login-btn"));

        // Locate the same WEB ELEMENT using different attribute values

        //         tagName[attribute = 'value']
        //         input[class = 'login-btn']

        // LOCATEd USING CLASS ATTRIBUTE
        //WebElement signInButton = driver.findElement(By.cssSelector("input[class = 'login-btn']"));

        // LOCATED USING TYPE ATTRIBUTE
        //WebElement signInButton = driver.findElement(By.cssSelector("input[type = 'submit']"));

        // LOCATED USING VALUE ATTRIBUTE
        WebElement signInButton = driver.findElement(By.cssSelector("input[value = 'Log In']"));





    }


}
