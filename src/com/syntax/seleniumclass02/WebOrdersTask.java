package com.syntax.seleniumclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrdersTask {
    //http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));//getting WebElement in return
        username.sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        String title=driver.getTitle();
        if(title.equals("Web Orders")){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is not correct");
        }
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();

    }

}
