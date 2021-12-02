package aqua.samples;

import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;

import aqua.lib.*;
import static aqua.lib.Logger.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumBasicExample {
  final static String PROJECT_PATH = System.getProperty("user.dir");

  public void run()
    throws Exception
  {
    System.setProperty("webdriver.chrome.driver", PROJECT_PATH + "/webdriver/v96/chromedriver");

    ChromeOptions chromeOptions = new ChromeOptions();

    chromeOptions
      .addArguments("--headless")
      .addArguments("--no-sandbox");

    WebDriver driver = new ChromeDriver(chromeOptions);

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.get("https://google.com");

    //log("URL = " + driver.getCurrentUrl() + " : title = " + driver.getTitle());

    //driver.navigate().back(); // forward() refresh()
    // driver.getWindowHandle(); get window / tabs handle

    Thread.sleep(1000);

    if (driver.getPageSource().contains("I'm Feeling Lucky")) {
      log("Pass");
    } else {
      log("Fail");
    }

    driver.quit();
  }
}
