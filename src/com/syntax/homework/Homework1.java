package com.syntax.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Sandra");
        driver.findElement(By.id("customer.lastName")).sendKeys("Bullock");
        driver.findElement(By.id("customer.address.street")).sendKeys("744 West Side Dr.");
        driver.findElement(By.id("customer.address.city")).sendKeys("Fairview");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("20163");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("202-412-3698");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-65-4987");
        driver.findElement(By.id("customer.username")).sendKeys("s.bullock");
        driver.findElement(By.id("customer.password")).sendKeys("qwert!@#$%1");
        driver.findElement(By.id("repeatedPassword")).sendKeys("qwert!@#$%1");
        driver.findElement(By.className("button")).click();
        driver.quit();


    }
}
