package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2_Linktext_Practice {


    public static void main(String[] args) throws InterruptedException {

        //1. Opern Chrome browser
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // 2. Go to http://practice.cydeo.com

        driver.navigate().to("http://practice.cydeo.com");
        // 3. Click to A/B Testing from top of the list
        //driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

            // 4.Verify title is:
            // Expected: No A/B Test

            String expectedTitle = "No A/B Test";
            String actualTitle = driver.getTitle();

            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Title verification PASS!");
            }else {
                System.out.println("Title verification FAILED!!!");
            }
            Thread.sleep(3000);

            // 5. Go back to home page by using the .back();
            driver.navigate().back();

            // 6. Verify title equals
            // Expected: Practice

            String expectedTitle2 = "Practice";
            String actualTile2 = driver.getTitle();

            if (actualTile2.equals(expectedTitle2)) {
                System.out.println("Title verification PASSED!");
            }else {
                System.out.println("Title verification FAILED!!!");
            }
    }
}
