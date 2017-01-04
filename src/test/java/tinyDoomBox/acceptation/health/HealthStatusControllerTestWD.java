package tinyDoomBox.acceptation.health;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HealthStatusControllerTestWD
{
    WebDriver driver;

    public HealthStatusControllerTestWD()
    {
    }

    @Before
    public void start()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/ressources/selenium/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void test()
    {
        driver.get("http://localhost:8080/healthstatus");
        WebElement aliveTextElement = driver.findElement(By.tagName("body"));
        assertEquals("Tiny Doom Box is alive!", aliveTextElement.getText());
    }

    @After
    public void quit()
    {
        driver.quit();
    }
}
