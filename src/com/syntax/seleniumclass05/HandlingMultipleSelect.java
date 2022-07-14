package com.syntax.seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingMultipleSelect {
    static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement statesDD = driver.findElement(By.id("multi-select"));
        Select select = new Select(statesDD);
        boolean multiple = select.isMultiple();
        System.out.println(multiple);
        if(multiple) {
            List<WebElement> options = select.getOptions();
            for (WebElement option : options) {
                String optionsTxt = option.getText();
                select.selectByVisibleText(optionsTxt);
            }
        }
        select.deselectByIndex(5);
        select.deselectAll();
    }
}