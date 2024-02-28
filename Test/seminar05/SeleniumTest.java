package seminar05;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SeleniumTest {
    @Test
    void selenium (){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.ru/");
        WebElement webElement = webDriver.findElement(By.name("q"));
        webElement.sendKeys("Selenium");
        webElement.submit();

        webElement = webDriver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/div/cite"));

        assertEquals("https://www.selenium.dev", webElement.getText());

        webDriver.quit();


    }
    @Test
    void testAuthorization() {
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://www.saucedemo.com/");

        WebElement webElement = webDriver.findElement(By.name("user-name"));
        webElement.sendKeys("standard_user");
        webElement = webDriver.findElement(By.id("password"));
        webElement.sendKeys("secret_sauce");
        webElement = webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input"));
        webElement.click();
        webElement = webDriver.findElement(By.className("title"));

        assertEquals("Products", webElement.getText());
        webDriver.quit();
    }
}


