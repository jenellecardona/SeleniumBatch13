package com.syntax.seleniumclass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework2 {
    /*
    Amazon link count:
Open chrome browser
Go to " https://www.amazon.com/"
Get all links
Get number of links that has text
Print to console only the links that has text
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));

        for (WebElement allLink : allLinks) {
            String linkText=allLink.getText();
            System.out.println(linkText);
       }
        driver.quit();

    }
}
