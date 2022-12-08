package Classwork.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest5 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("погода минск");
        Thread.sleep(1000);
        search.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
        driver.findElement(By.xpath("//div[text()='чт']")).click();
        WebElement element = driver.findElement(By.xpath("//*[contains(@aria-label, 'Celsius четверг 12:00')]"));
        System.out.println(element.getAttribute("aria-label"));









    }

}