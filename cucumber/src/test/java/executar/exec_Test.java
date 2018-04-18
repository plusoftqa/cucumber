package executar;

 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/MenuAdmCalendarioFeriado.feature",
//glue = { "" }, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
//monochrome = true,
//dryRun = false)


@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/java/",
					glue = { "" },
					plugin = {
						"pretty",
						"html:target/cucumber-htmlreport",
						"json:target/cucumber-report.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
						}
				
)

public class exec_Test {
	




//
//	@AfterClass
//	public static void writeExtentReport() throws IOException {
//	
//		
//		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//	    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
//	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
//	    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
//	    Reporter.setSystemInfo("Selenium", "3.7.0");
//	    Reporter.setSystemInfo("Maven", "3.5.2");
//	    Reporter.setSystemInfo("Java Version", "1.8.0_151");
//	     
//
//	    }	
	
}

