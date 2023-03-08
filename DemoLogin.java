package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoLogin {
    @Test
    public void test(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://github.com/login");
        driver.findElement(By.id("login_field")).sendKeys("2000030907@kluniversity.in");
        driver.findElement(By.id("password")).sendKeys("Sanaka@03");
        driver.findElement(By.name("commit")).click();
        System.out.println(driver.findElement(By.className("js-flash-alert")).getText());

    }
}