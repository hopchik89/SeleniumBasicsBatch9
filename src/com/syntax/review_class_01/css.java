package com.syntax.review_class_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Syntax\\selenium\\intaall\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launch the browser
        String url="https://syntaxtechs.com/selenium-practice/basic-first-form-demo.php";
        driver.get(url);
        driver.findElement(By.cssSelector("input[id='user-message']")).sendKeys("moazzam");//css

        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click(); //xpath

        WebElement text = driver.findElement(By.cssSelector(" span#display"));//use id shortcut
        String name;
        System.out.println(name=text.getText());
        if(name.equalsIgnoreCase("moazzam")){
            System.out.print("correct name");
        }
        else{
            System.out.print("wrong name");
        }

        driver.findElement(By.cssSelector("input[id*='m1']")).sendKeys("100");//contains

        driver.findElement(By.cssSelector(" input[id$='m2']")).sendKeys("300");//endswith

        driver.findElement(By.cssSelector(" button[onclick^='return']")).click();//startswith

        WebElement SUM = driver.findElement(By.cssSelector(" span[id*='value']"));//contains
        String Value = SUM.getText();
        if(Value.equalsIgnoreCase("400")){
            System.out.println("correct answer");
        }
        else{
            System.out.println("wrong answer");
        }
    }

//

}
