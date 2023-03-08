

package org.example;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.hackerrank.com/auth/login/decisions");
        driver. findElement(By.id("input-1")).sendKeys("2000030907@kluniversity.in");
        driver.findElement(By.id("input-2")).sendKeys("Meghana@03");
        //driver.findElement(By.className("login-logo"));
        driver.findElement(By.linkText("Lost password?")).sendKeys("text-link forgot-password-link");

        driver.findElement(By.xpath("font-size:1.1rem;")).click();


    }
}