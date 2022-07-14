package com.syntax.seleniumreviewclass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinksExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //get all the links from the website of syntax
        driver.get("http://syntaxprojects.com/");
       List<WebElement> links=driver.findElements(By.tagName("a"));
        for (WebElement l:links) {
            String link=l.getText();
            System.out.println(link);
        }



    }
}
