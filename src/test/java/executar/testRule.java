package executar;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class testRule {
	//private static WebDriver driver;
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extentReportr;
	private static ExtentTest extentTest;

@Before
public void beforeCenario(Scenario cenario) {
	if (extentReportr == null) {
		extentReportr = new ExtentReports();
		htmlReporter  = new ExtentHtmlReporter("C:\\Users\\amarinho\\projetosQA\\automation\\target\\TesteExtentReport.html");
		extentReportr.attachReporter(htmlReporter);
	}
	
	extentTest = extentReportr.createTest(cenario.getId());
}

@After
public void afterCenario(Scenario cenario) {
	if (cenario.isFailed()){
		extentTest.log(Status.FAIL, "Cenário "+cenario.getName()+" com falha!");
	}else {
	extentTest.log(Status.PASS, "Cenário "+cenario.getName()+" executado com sucesso!");
	extentReportr.flush();
	}
}

public static ExtentTest getExtentTest() {
	return extentTest;	
}

}
