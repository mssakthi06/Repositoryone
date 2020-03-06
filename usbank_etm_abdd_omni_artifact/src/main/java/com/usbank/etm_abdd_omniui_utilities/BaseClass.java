package com.usbank.etm_abdd_omniui_utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log = LoggerFactory.getLogger(BaseClass.class);
	public static boolean log4jpropertiesloaded = false;

	public BaseClass() {

		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"src/main/resource/com/usbank/etm_abdd_omniui_config/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void initialization() {

		if (!log4jpropertiesloaded) {
			InputStream logconfig = null;
			try {
				logconfig = new ClassPathResource("com/usbank/etm_abdd_omniui_config/log4j.properties")
						.getInputStream();
				PropertyConfigurator.configure(logconfig);
				log4jpropertiesloaded = true;
				log.info("Log level INFO enabled");
				log.debug("Log level DEBUG enabled");
				log.warn("Log level WARN enabled");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		String browserName = prop.getProperty("browser");
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"src/main/resource/com/usbank/etm_abdd_omniui_driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/main/resource/com/usbank/etm_abdd_omniui_driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		log.info("********************************************************");
		log.info("Test Execution Starts");
		log.info("Opening the browser");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url_uat"));
	}

	protected boolean waitforElementtobeclickable(WebElement elm, int seconds) {
		boolean elementwasclickable = false;
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(elm));
			elementwasclickable = true;
		} catch (TimeoutException e) {
			log.debug("Couldn't find the element " + elm.toString() + "in the webpage");
			elementwasclickable = false;
		} catch (Exception e) {
			log.debug("Generic Exception" + e.getMessage());
			elementwasclickable = false;
		}
		return elementwasclickable;

	}

	protected boolean waitforElementtobevisible(WebElement elm, int seconds) {
		boolean elementwasvisible = false;
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try {
			wait.until(ExpectedConditions.visibilityOf(elm));
			elementwasvisible = true;
		} catch (TimeoutException e) {
			log.debug("Couldn't find the element " + elm.toString() + "in the webpage");
			elementwasvisible = false;
		} catch (Exception e) {
			log.debug("Generic Exception" + e.getMessage());
			elementwasvisible = false;
		}
		return elementwasvisible;

	}

}
