package abstractPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class BasePageClass extends APIClass {

    private int WAITER_TIME_OUT = 10;
    private final int  DRIVER_WAIT_TIME = 120;

    @Override
    public WebDriver getDriver() {
        return driver;
    }


    public WebDriver initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }


    public WebElement waitForExpectedElement(By webElementLocator) {
        return new WebDriverWait(driver, WAITER_TIME_OUT)
                .until(ExpectedConditions.presenceOfElementLocated(webElementLocator));
    }


    @BeforeClass
    public void setUp() {
        initializeDriver();
        waitPageIsLoadedAndJQueryIsProcessed();
    }

    @AfterClass
    public void closeDown() {
        driver.quit();
    }


    public void waitPageIsLoadedAndJQueryIsProcessed() {
        waitPageIsLoaded();
    }

    public void waitPageIsLoaded() {
        try {
            ExpectedCondition<Boolean> expectedCondition = driver -> getDocumentReadyState().equals("complete");
            Wait<WebDriver> wait = new WebDriverWait(getDriver(), DRIVER_WAIT_TIME);
            wait.until(expectedCondition);
        } catch (Exception ex) {
            LOGGER.warning("Fail waiting for document ready state. Current state:" + getDocumentReadyState());
        }
    }

    private String getDocumentReadyState() {
        return (String) ((JavascriptExecutor) getDriver()).executeScript("return document.readyState");
    }

        }