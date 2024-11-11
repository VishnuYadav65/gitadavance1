package com.qapitol.Pageclass;

import com.qapitol.Base.baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class brokenLinks extends baseclass {

@Test
    public void broken() throws IOException {
        baseclass.intializer();
        scroll(0,500);
        driver.findElement(By.id("item-6")).click();




        List<WebElement> Links = driver.findElements(By.xpath("//p/following-sibling::a"));

         for(WebElement link:Links){

             String url = link.getAttribute("href");

             HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();

             conn.setRequestMethod("HEAD");

             conn.connect();

             int repcode = conn.getResponseCode();

             System.out.println(conn.getResponseCode());


             }



         }
    }

}
