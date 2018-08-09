package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.junit.TextReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", glue = "stepsDef",  monochrome = true, dryRun = false)
public class ConfigurationHelperRunner {
    @Rule
    public TestRule report = new TextReport().onFailedTest(true).onSucceededTest(true);

@BeforeClass
    public static void setUp() {
        WebDriverRunner.clearBrowserCache();
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
     //   Configuration.baseUrl = "https://github.com/";
        Configuration.timeout = 10000;
    }

@AfterClass
    public static void tearDown() {
        WebDriverRunner.closeWebDriver();
    }

}
