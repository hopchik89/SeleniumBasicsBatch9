package com.syntax.review_class_01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class locators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Syntax\\selenium\\intaall\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launch the browser
        String url="https://www.saucedemo.com/";

        driver.get(url);
        Thread.sleep(3000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);
        driver.findElement(By.className("inventory_item_name")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("ABOUT")).click();
        Thread.sleep(5000);
        String tilte=driver.getTitle();
        if(tilte.equalsIgnoreCase("Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs"))
        {
            System.out.println("you were naviagted to right page");
        }
        else
        {
            System.out.println("you were naviagted to wrong page");
        }
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);

        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("checkout")).click();
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("LOG")).click();

    }
}
