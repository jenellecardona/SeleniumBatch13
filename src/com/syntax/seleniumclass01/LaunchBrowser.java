package com.syntax.seleniumclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");//setting the property to use chrome driver
        //on MAC .exe (chromedriver.exe) is not needed but on Windows computers it is needed.
        WebDriver driver=new ChromeDriver();// launch the browser
        //creating an object of the webdriver, allows us to interact with the browser
        driver.get("http://google.com");
        String url= driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
