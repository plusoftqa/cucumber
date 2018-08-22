package executar;

 
import org.junit.After;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/MenuAdmCalendarioFeriado.feature",
//glue = { "" }, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
//monochrome = true,
//dryRun = false)


@RunWith(Cucumber.class)
@CucumberOptions( features = "Features/",
					glue = { "" },
					plugin = {
						"pretty",
						"html:target/cucumber-htmlreport",
						"json:target/cucumber-report.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
						}
				
)

public class exec_Test {
	

	
}

