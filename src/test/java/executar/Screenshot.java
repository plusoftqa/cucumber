package executar;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;




public class Screenshot {
	static  ExtentReports extent;
    static ExtentTest test;
		
	
	@After	
		public void tearDown(Scenario scenario) {
		System.out.println("teste");
		//String caminho = "C:\\Users\\amarinho\\projetosQA\\automation\\target\\image\\";
		
		if (scenario.isFailed()) {
		
			String scrFile = ((TakesScreenshot)Util.driver).getScreenshotAs(OutputType.BASE64);

			try {       
			//FileUtils.copyFile(scrFile, new File(caminho+scenario.getName()+".jpg"));
			
//			InputStream screenshotStream = new FileInputStream(scrFile);
//			scenario.embed(IOUtils.toByteArray(screenshotStream), "image/png");
//			Reporter.pass( Reporter.addScreenCaptureFromPath("data:image/gif;base64,"+scrFile.toString()));
			Reporter.addScreenCaptureFromPath("data:image/gif;base64,"+scrFile.toString());
			
			//Reporter.addScreenCaptureFromPath(caminho+scenario.getName()+".jpg".toString());
			//MediaEntityBuilder.createScreenCaptureFromPath(caminho+scenario.getName()+".jpg".toString()).build();
			//MediaEntityBuilder.createScreenCaptureFromBase64String(scenario.getName()+".jpg".toString()).build();
		
			} catch (IOException e) {
			
			e.printStackTrace();
		//	}
			
		}
	}

	}}
	/*@AfterMethod
	public void setTestResult(ITestResult result) throws IOException {
		String scrFile = ((TakesScreenshot)Util.driver).getScreenshotAs(OutputType.BASE64);
		//Reporter.addScreenCaptureFromPath("data:image/gif;base64,"+scrFile.toString());

		//String screenShot = CaptureScreenShot.captureScreen(Util.driver, CaptureScreenShot.generateFileName(result));

		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
			test.log(Status.FAIL,result.getThrowable());
			test.fail("Screen Shot : " + test.addScreenCaptureFromPath("data:image/gif;base64,"+scrFile.toString()));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
			test.pass("Screen Shot : " + test.addScreenCaptureFromPath("data:image/gif;base64,"+scrFile.toString()));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.skip("Test Case : " + result.getName() + " has been skipped");
		}
 
		extent.flush();
		Util.driver.close();
	}
    */
    
