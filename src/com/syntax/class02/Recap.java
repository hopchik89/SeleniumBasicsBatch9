package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Facebook - Log In or Sign up")){
            System.out.println("Title is RIGHT");
        } else {
            System.out.println("Title is WRONG ");
        }
        driver.quit();
    }
}
