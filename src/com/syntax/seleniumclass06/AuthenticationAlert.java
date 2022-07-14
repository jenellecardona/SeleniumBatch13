package com.syntax.seleniumclass06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
    static String url = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
    //username:password@Link (addmin:admin@) <= username and password

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
