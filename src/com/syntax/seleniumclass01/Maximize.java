package com.syntax.seleniumclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();
    }
}
