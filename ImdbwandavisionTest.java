// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ImdbwandavisionTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void imdbwandavision() {
    // Test name: imdb-wandavision
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://www.imdb.com/");
    // 2 | click | id=suggestion-search | 
    driver.findElement(By.id("suggestion-search")).click();
    // 3 | type | name=q | wandavision
    driver.findElement(By.name("q")).sendKeys("wandavision");
    // 4 | sendKeys | name=q | ${KEY_ENTER}
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    // 5 | click | linkText=WandaVision | 
    driver.findElement(By.linkText("WandaVision")).click();
  }
}
