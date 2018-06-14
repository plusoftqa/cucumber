package executar;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
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
	        
			Reporter.addScreenCaptureFromPath("data:image/gif;base64,"+scrFile.toString());
			//Reporter.addScreenCaptureFromPath(caminho+scenario.getName()+".jpg".toString());
			//MediaEntityBuilder.createScreenCaptureFromPath(caminho+scenario.getName()+".jpg".toString()).build();
			//MediaEntityBuilder.createScreenCaptureFromBase64String(scenario.getName()+".jpg".toString()).build();
		
			} catch (IOException e) {
			
			e.printStackTrace();
			}
			
		}
	}
}