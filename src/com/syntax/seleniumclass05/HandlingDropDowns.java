package com.syntax.seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropDowns {
        static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get(url);
            WebElement daysDD=driver.findElement(By.id("select-demo"));
            Select select=new Select(daysDD);//Select class is used to interact with dropdowns
            select.selectByIndex(3);
            Thread.sleep(2000);
            select.selectByVisibleText("Thursday");
            Thread.sleep(2000);
            select.selectByValue("Friday");

            List<WebElement> allOptions=select.getOptions();
            int size= allOptions.size();
            System.out.println(size);

//            for (int i = 0; i < size; i++) {
//              String option=allOptions.get(i).getText(); //System.out.println(allOptions.get(i).getText());
//              System.out.println(allOptions.get(i).getText());
//            }
            for (int i = 0; i < size; i++) {
                String option=allOptions.get(i).getText(); //System.out.println(allOptions.get(i).getText());
               select.selectByIndex(i);
                System.out.println(option);
               Thread.sleep(1000);
            }


    }
}
