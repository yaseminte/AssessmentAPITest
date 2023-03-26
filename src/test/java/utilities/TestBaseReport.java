package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestBaseReport {
    protected static ExtentReports extentReports;
    protected static ExtentTest extentTest;

    protected static ExtentHtmlReporter extentHtmlReporter;

    @BeforeTest(alwaysRun = true)
    public void setUpTest() {
        extentReports = new ExtentReports();

        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String filePath = System.getProperty("user.dir") + "/target/Rapor/rapor" + date + ".html";

        extentHtmlReporter = new ExtentHtmlReporter(filePath);
        extentReports.attachReporter(extentHtmlReporter);
        extentReports.setSystemInfo("Environment", "QA");
        extentReports.setSystemInfo("Software Test Specialist", "Yasemin Türker");
        extentHtmlReporter.config().setDocumentTitle("Rapor");
        extentHtmlReporter.config().setReportName("TestNG Reports");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {

            extentTest.fail(result.getName());
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            extentTest.skip("Test Case is skipped: " + result.getName());
        }

    }

    @AfterTest(alwaysRun = true)
    public void tearDownTest() {
        extentReports.flush();
    }
}
