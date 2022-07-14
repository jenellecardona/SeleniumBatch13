package com.syntax.seleniumclass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    /*
    Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName=driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");
        WebElement passWord=driver.findElement(By.cssSelector("input[type $='Password']"));
        passWord.sendKeys("Hum@nhrm123");
        WebElement loginButton=driver.findElement(By.cssSelector("input[id *='btn']"));
        loginButton.click();
        WebElement syntaxLogo=driver.findElement(By.cssSelector("img[src *='syntax.png']"));
        System.out.println(syntaxLogo.isDisplayed());
        driver.quit();




    }
}
