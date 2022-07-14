package com.syntax.seleniumclass06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
        static String url = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
        //username:password@Link (addmin:admin@) <= username and password

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            driver.switchTo().frame(0);//to switch to iframe
            WebElement textBox=driver.findElement(By.id("name"));
            textBox.sendKeys("Batch 13");

            driver.switchTo().defaultContent();//to get out of frame
            WebElement alertButton=driver.findElement(By.id("alert"));
            alertButton.click();
            Alert alert=driver.switchTo().alert();
            alert.accept();//once you've acknowledged the alert it will redirect automatically so you can interact with the webpage.
            //for iframe you need to switch manually
            driver.switchTo().frame("iframe_a");
            textBox.clear();
            textBox.sendKeys("we are back to the frame");

            driver.switchTo().defaultContent();
            WebElement frameElement=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
            driver.switchTo().frame(frameElement);
            textBox.clear();
            textBox.sendKeys("Hold your horses");

    }
}
