package com.syntax.seleniumclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    /*
    Navigate to http://syntaxprojects.com
    Click on start practicing
    click on simple form demo
    enter any text on first text box
    click on show message
    quit the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        WebElement startButton=driver.findElement(By.xpath("//a[@id = 'btn_basic_example']"));
        startButton.click();
        Thread.sleep(3000);
        WebElement simpleForm=driver.findElement(By.xpath("//a[contains(text(),'Simple Form Demo')]/parent::div//preceding-sibling::a"));
        simpleForm.click();
        WebElement message=driver.findElement(By.xpath("//input[@id = 'user-message']"));
        message.sendKeys("test");
        Thread.sleep(2000);
        WebElement showMsgButton=driver.findElement(By.xpath("//button[contains(@onclick,'showInput')] "));
        showMsgButton.click();
        Thread.sleep(3000);
        driver.quit();




    }
}
