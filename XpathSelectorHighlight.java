
package org.example;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelectorHighlight
{
    @Test
    public void Test()
    {
        WebDriver driver;
        System.out.println("welcome");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        Highlight(driver,driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")));
    }

    public void Highlight(WebDriver driver , WebElement element)
    {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].setAttribute('style', 'background: orange;')", element);
    }
}