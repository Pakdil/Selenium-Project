package com.cydeo.tests.day3_sccSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.IllegalFormatCodePointException;

public class T2_getText_getAttribute {

    public static void main(String[] args) {
        //    TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//            3- Verify “remember me” label text is as expected:
//    Expected: Remember me on this computer
WebElement RememberMeLable = driver.findElement(By.className("login-item-checkbox-label"));

String expectedRememberMeLable = "Remember me on this computer";
String actualRememberMeLable = RememberMeLable.getText();



if (actualRememberMeLable.equals(expectedRememberMeLable)) {
    System.out.println("Lable verificaton PASSED!");
}else {
    System.out.println("Lable verification FAILED!!!");
}

//4- Verify “forgot password” link text is as expected:
//    Expected: Forgot your password?

        WebElement ForgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

String expectedForgotPasswordLinkText = "Forgot your password?";
String actualForgotPasswordLinkText = ForgotPasswordLink.getText();

if (actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)) {
    System.out.println("Forgot password link verification PASSED!");
} else {
    System.out.println("actualForgotPasswordLinkText" +actualForgotPasswordLinkText);
    System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);
    System.out.println("Forgot password link verification FAILED!!!");
}
//            5- Verify “forgot password” href attribute’s value contains expected:
//    Expected: forgot_password=yes

        String expectedInHref = "forgot_password=yes";
String actualHrefAttributeValue = ForgotPasswordLink.getAttribute("href");

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

if (actualHrefAttributeValue.contains(expectedInHref)) {

    System.out.println("HREF attribute value verification PASSED!");
} else {

    System.out.println("HREF attribute value verification FAILED!!!");
}



    }




}
