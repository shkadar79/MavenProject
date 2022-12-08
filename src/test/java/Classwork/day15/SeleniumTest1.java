package Classwork.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {

    public static WebDriver void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://onliner.by");
        WebElement el = driver.findElement(By.className("onliner_logo"));
        el.click();
        driver.close();

    }

}