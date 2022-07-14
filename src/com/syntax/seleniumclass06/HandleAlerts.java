package com.syntax.seleniumclass06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    static String url = "http://www.amazon.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement simpleAlertButton=driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();//gives us an alert object
        alert.accept();

        Alert confirmAlertButton=driver.switchTo().alert();
        String confirmAlertText= confirmAlertButton.getText();
        System.out.println(confirmAlertText);
        confirmAlertButton.dismiss();

        WebElement promptAlertButton= driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Test");
        promptAlert.accept();





    }
}
