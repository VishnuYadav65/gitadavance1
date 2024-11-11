package com.qapitol.Pageclass;

import com.qapitol.Base.baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class webtables extends baseclass
{



@Test
    public void table(){
    baseclass.intializer();
    scroll(0,100);
    driver.findElement(By.id("item-3")).click();
    scroll(0,200);
    driver.findElement(By.id("addNewRecordButton")).click();
    driver.findElement(By.id("firstName")).sendKeys("Vishnu");
    driver.findElement(By.id("lastName")).sendKeys("Yadav");
    driver.findElement(By.id("userEmail")).sendKeys("vishnuyadav@gmail.com");
    driver.findElement((By.id("age"))).sendKeys("25");
    driver.findElement(By.id("salary")).sendKeys("25,00000");
    driver.findElement(By.id("department")).sendKeys("Insurance");
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();",driver.findElement(By.id("submit")));


    }

}
