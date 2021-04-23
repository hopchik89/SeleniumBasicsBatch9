package com.syntax.review_class_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * goto bbc.com
 * click on signin
 * click on register now
 * click on age greater then 16
 * enter day month and year and press continue*/
public class Xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Syntax\\selenium\\intaall\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launch the browser
        String url="https://www.bbc.com/";
        driver.get(url);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='idcta-link']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text() = 'Register now']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@href, 'age?')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@id, 'day')]")).sendKeys("20");
        driver.findElement(By.xpath("//input[starts-with(@id, 'month')]")).sendKeys("03");
        driver.findElement(By.xpath("//input[starts-with(@id, 'year')]")).sendKeys("1992");
        driver.findElement(By.xpath("//span[starts-with(text(), 'Conti')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@id, 'user')]")).sendKeys("moazzamsadiq4@gmail.com");

        driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("QWErt2323");

        driver.findElement(By.xpath("//button[contains(@class,'button')]")).click();

    }
}

