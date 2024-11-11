package com.qapitol.Pageclass;

import com.qapitol.Base.baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Stream;

public class links extends baseclass {
    @Test
    public void link(){
        baseclass.intializer();
        baseclass.scroll(0,200);
        driver.findElement(By.id("item-5")).click();



        baseclass.scroll(0,200);


        List<WebElement> link = driver.findElements(By.xpath("//p/a"));
        for(int i=0;i<link.size();i++){
            link.get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
        }



    }
}
