package com.qapitol.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class baseclass {
    public static WebDriver driver;
    public static void intializer(){
        driver = new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public static void teardown(){
        driver.close();
    }

    public static void  wait1(String Xpath) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
    }

    public static void scroll(int val,int val1){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+val+","+val1+")");


    }



}

