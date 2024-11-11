package com.qapitol.Pageclass;

import com.qapitol.Base.baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Elements extends baseclass {

    @Test
    public void textbox() throws InterruptedException {

        baseclass.intializer();
        baseclass.wait1("//input[@class=' mr-sm-2 form-control']");
        driver.findElement(By.xpath("//input[@class=' mr-sm-2 form-control']")).sendKeys("Vishnu");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ASDFGH@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Address");
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("permanenet Address");

        baseclass.scroll(0,200);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        baseclass.teardown();
    }

}

