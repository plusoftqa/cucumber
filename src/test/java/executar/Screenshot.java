package executar;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;


public class Screenshot {
	public static void logPrint(String strLog) {
		ExtentTest extetntTest = testRule.getExtentTest();
		try {
//			efetuarPrintTela(strLog);
			String scrFile = ((TakesScreenshot) Util.driver).getScreenshotAs(OutputType.BASE64);
			extetntTest.log(Status.INFO, strLog, MediaEntityBuilder
					.createScreenCaptureFromBase64String
					(scrFile)
					.build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   private static void efetuarPrintTela(String strLog) {
//	   File scrFile = ((TakesScreenshot) Util.driver).getScreenshotAs(OutputType.FILE);
//	try {
//		FileUtils.copyFile(scrFile, 
//				   new File("C:\\Users\\janio.marinho\\Downloads\\cucumber-master\\cucumber-master\\cucumber\\src\\test\\resources\\" + strLog + ".png"));
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	   
   }
//	public ExtentTest extent ; 
//	public String capture() throws IOException {
//		String filename = System.currentTimeMillis() + ".png";
//		File imgFile = ((TakesScreenshot)Util.driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(imgFile,  new File("output/"+filename));
//		
//		return "output/"+filename;
//		
//		
//		

	
	
	
//	@After	
//		public void tearDown(Scenario scenario) {
//		System.out.println("teste");
//		String caminho = "C:\\Users\\janio.marinho\\Downloads\\cucumber-master\\cucumber-master\\cucumber\\target\\image\\";
//		
////		String caminho = "C:\\Users\\amarinho\\gitCucumber\\cucumber\\target\\image\\";
//		
//		if (scenario.isFailed()) {
//		
//			File scrFile = ((TakesScreenshot)Util.driver).getScreenshotAs(OutputType.FILE);
//
//			try {       
//			FileUtils.copyFile(scrFile, new File(caminho+scenario.getName()+".jpg"));
//			
//			InputStream screenshotStream = new FileInputStream(scrFile);
//			scenario.embed(IOUtils.toByteArray(screenshotStream), "image/png");
//	        
//	        
//			Reporter.addScreenCaptureFromPath(caminho+scenario.getName()+".jpg".toString());
//			MediaEntityBuilder.createScreenCaptureFromPath(caminho+scenario.getName()+".jpg".toString()).build();
//		
//			} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			}
//			}
//		
//	}
//	
	
}





//package executar;
//
//
//
//
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.IOUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.cucumber.listener.Reporter;
//
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//
//
//
//
//public class Screenshot {
//	
//
//
//	
//	
//
//   static  ExtentReports extent;
//    static ExtentTest test;
////	public ExtentTest extent ; 
////	public String capture() throws IOException {
////		String filename = System.currentTimeMillis() + ".png";
////		File imgFile = ((TakesScreenshot)Util.driver).getScreenshotAs(OutputType.FILE);
////		FileUtils.copyFile(imgFile,  new File("output/"+filename));
////		
////		return "output/"+filename;
////		
////		
////		
//
//	
//	
//	
//	@After	
//		public void tearDown(Scenario scenario) {
//		System.out.println("teste");
//		String caminho = "C:\\Users\\amarinho\\gitCucumber\\cucumber\\target\\image\\";
//		
//		if (scenario.isFailed()) {
//		
//			File scrFile = ((TakesScreenshot)Util.driver).getScreenshotAs(OutputType.FILE);
//
//			try {       
//			FileUtils.copyFile(scrFile, new File(caminho+scenario.getName()+".jpg"));
//			
//			InputStream screenshotStream = new FileInputStream(scrFile);
//			scenario.embed(IOUtils.toByteArray(screenshotStream), "image/png");
//	        
//	        
//			Reporter.addScreenCaptureFromPath(caminho+scenario.getName()+".jpg".toString());
//			MediaEntityBuilder.createScreenCaptureFromPath(caminho+scenario.getName()+".jpg".toString()).build();
//		
//			} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			}
//			
//		}
//	}
//}
//	
	
	

	
	    
	
	

	



	

	
	
	
	
	


