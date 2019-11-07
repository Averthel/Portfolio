package pl.portfolio.portfolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FirstAutomatedTest {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void myFirstTest() {
        driver.navigate().to("http://localhost:63342/portfolio/templates/index.html?_ijt=7senui0te200of41f8gu4p2mut");
        String pageTitle = driver.getTitle();
        assertTrue(pageTitle.contains("MyPortfolio"));
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}