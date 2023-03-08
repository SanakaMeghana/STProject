
package org.example;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector
{
    @Test
    public void Test()
    {
        WebDriver driver;
        System.out.println("welcome");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("#content > div > div > div > div._8esl > div > img"));

    }


}