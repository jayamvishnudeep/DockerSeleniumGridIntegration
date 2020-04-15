package Docker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirefoxDockerIntegration {

    @Test
    public void testDocker() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setBrowserName(BrowserType.FIREFOX);

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4546/wd/hub"), capabilities);

        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium Docker Integration");
        Thread.sleep(10);
        driver.quit();

    }

}
