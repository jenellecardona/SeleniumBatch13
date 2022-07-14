package com.syntax.seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class HandleDDWithIterator {
    static String url = "http://www.amazon.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoriesDD);
        List<WebElement> options = select.getOptions();
        Iterator<WebElement> it=options.iterator();//whenever you use Iterator you need to use While Loop
        while(it.hasNext()){
           WebElement ddOption= it.next();
           String optionText=ddOption.getText();
            System.out.println(optionText);
        }


    }
}

