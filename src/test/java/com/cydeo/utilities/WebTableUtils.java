package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableUtils {

//    Method #1 info:
//• Name: returnOrderDate ()
//• Return type: String
//• Arg1: WebDriver driver
//• Arg2: String costumerName
//    This method should accept a costumerName and return the costumer order date
//    as a String.

//public static String returenOrderDate(WebDriver driver, String customerName) {
//
//}

    public static String returnOrderDate(WebDriver driver, String customerName) {

        String locator = "//td[.='"+customerName+"']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        return customerDateCell.getText();

        // example
//        String middleName = "L";
//        String fullName = "Samuel "+ middleName + "Jacson";

        
    }


}
