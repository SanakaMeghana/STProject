
package org.example;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelector {
    @Test
    public void Test()
    {
        WebDriver driver;
        System.out.println("welcome");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
    }
}
