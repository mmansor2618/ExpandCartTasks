package Tests;

import Pages.Task1Page;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.LogStatus;

public class Task1Test extends TestBase {

    Task1Page task1Page;

    @Test
    public void AssertFirstResult() {
        String URL = prop.getProperty("task1URL");
        driver.get(URL);
        task1Page = new Task1Page(driver);

        String searchInput = prop.getProperty("searchData");
        String FirstResult = task1Page.Search(searchInput);
        System.out.println(FirstResult);
        assertTrue(FirstResult.contains("Selenuim - Web Browser Automation"));
    }
}

