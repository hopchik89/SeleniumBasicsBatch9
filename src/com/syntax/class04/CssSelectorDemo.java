package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        WebElement startPracticingButton = driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPracticingButton.click();
        Thread.sleep(2000);
        WebElement simpleForm = driver.findElement(By.xpath("(//a[text() = 'Simple Form Demo'])[2]"));
        simpleForm.click();
        Thread.sleep(2000);
        WebElement messageTextBox = driver.findElement(By.cssSelector("input[placeholder ^= 'Please enter']"));
        messageTextBox.sendKeys("practice makes perfect");
        WebElement showMessageButton = driver.findElement(By.cssSelector("button[onclick *= 'show']"));
        showMessageButton.click();

        driver.quit();
    }
}
