package executar;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;

public class Util {
	
	public static WebDriver driver;

	
	
	public static void Selecionar_Menu_e_Sub_menu_ADM(String MenuADM)
			throws Exception {
		
		WebElement target = driver.findElement(By.cssSelector(MenuADM));
		// WebElement target =
		// driver.findElement(By.cssSelector("a[href='/forms-v2/finder/CRM_PERSONCOMPANYSIZE']"));
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView(true);", target);
		Thread.sleep(500); // not sure why the sleep was needed, but it was
							// needed or it wouldnt work :(
		target.click();
		
		

	}
	
	public static void Clicar (By parametro) {
		
		driver.findElement(parametro).click();
		
		
	}
	
	public void Digitar (By parametro, String value) {
		try {
	//	Screenshot s = new Screenshot();
		driver.findElement(parametro).sendKeys(value);
		
		}catch(Exception d) {
			
			
		}
	}
	
	public void botaoSalvarMenuAdm () {
		driver.findElement(By.cssSelector("button[aria-label='save']")).click();;
	}
	
	public void selectMenuAdm(By parametro, String value ) {
		driver.findElement(parametro).isDisplayed();
		Select select = new Select(driver.findElement(parametro));

		// System.out.println(select.getOptions().contains(text) + "/n");
		// select.getFirstSelectedOption().isSelected();
		// select.selectByIndex(1);
		select.selectByVisibleText(value);

	}
	
	public static String imgPg(String pasta) throws Exception {

		UUID uuid = UUID.randomUUID();
		Date now = new Date();
		DateFormat diaf = new SimpleDateFormat("dd");
		DateFormat mesf = new SimpleDateFormat("MM");
		DateFormat anof = new SimpleDateFormat("yyyy");
		String diaF = diaf.format(now);
		String mesF = mesf.format(now);
		String anoF = anof.format(now);
		String dataPasta = diaF + "_" + mesF + "_" + anoF;

		File diretorio = new File("///172.16.2.94\\Automacao\\Evidencias\\" + dataPasta
				+ "//" + pasta + "//" + "_");

		// System.out.println(diretorio);

		diretorio.mkdirs();
		// System.out.println(diretorio.mkdirs());
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		Rectangle screenRect = new Rectangle(screenSize);

		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e1) {

			e1.printStackTrace();
		}
		BufferedImage image = robot.createScreenCapture(screenRect);
		int new_w = 1600, new_h = 900;
		BufferedImage new_img = new BufferedImage(new_w, new_h,
				BufferedImage.TYPE_INT_RGB);
		Graphics2D g = new_img.createGraphics();
		g.drawImage(image, 0, 0, new_w, new_h, null);
		ImageIO.write(new_img, "JPG", new File(diretorio + "_" + uuid + ".jpg"));

		// System.out.println(diretorio
		// + method + "_" + uuid
		// + ".jpg");
		return diretorio + "_" + uuid + ".jpg";

	}
	


}
