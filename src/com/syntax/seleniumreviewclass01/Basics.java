package com.syntax.seleniumreviewclass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        //Launch google.com
        driver.get("http://syntaxprojects.com/");
        WebElement startButton=driver.findElement(By.linkText("Start Practising"));
        startButton.click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Proceed")).click();



    }
}
