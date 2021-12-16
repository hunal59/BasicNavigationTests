package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
    testdriver("chrome");
    testdriver("firefox");
    testdriver("edge");
    }
    public static void testdriver(String browser)  {

       WebDriver driver = BrowserFactory.getDriver(browser);//1

        driver.get("https://google.com");//2

        String expectedTitleGoogle = driver.getTitle();//3

        driver.get("https://etsy.com");//4

        String expectedTitleEasy = driver.getTitle();//5

        driver.navigate().back();//6

        String actualTitleGoogle = driver.getTitle();

        StringUtility.verifyEquals(expectedTitleGoogle , actualTitleGoogle);//7

        driver.navigate().forward();//8

        String actualTitleEasy = driver.getTitle();

        StringUtility.verifyEquals(expectedTitleEasy, actualTitleEasy);//9

        driver.quit();
    }
}
