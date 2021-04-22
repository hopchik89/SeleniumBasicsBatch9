package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/basic-radiobutton-demo.php");
        WebElement ageRadioButton = driver.findElement(By.cssSelector("input[value = '0 - 5']"));
        boolean isAgeRadioBtnEnabled = ageRadioButton.isEnabled();
        System.out.println(isAgeRadioBtnEnabled);

        if(!isAgeRadioBtnEnabled) {
            System.out.println("not enabled");
        } else {
            System.out.println("it is enabled");
        }

        boolean isAgeRadioBtnDisplayed = ageRadioButton.isDisplayed();
        System.out.println(isAgeRadioBtnDisplayed);

        boolean isAgeRadioBtnSelected = ageRadioButton.isSelected();
        System.out.println("Before clicking " + isAgeRadioBtnSelected);
        ageRadioButton.click();
        isAgeRadioBtnSelected = ageRadioButton.isSelected();
        System.out.println("After clicking " + isAgeRadioBtnSelected);

        driver.quit();
    }
}
