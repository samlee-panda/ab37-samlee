package package2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_login_ddt {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1= new FileInputStream("/Users/samlee.panda/eclipse-workspace/Project2/ExcelSheet/samlee.xlsx");
		//fileinputstrem is a class which is present in apache io
		Workbook wb=   WorkbookFactory.create(f1);
		//worbookfactory is a final class which has a method create
	String un=	wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
	//String pwd=	wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();	
	//getstringvalue is a method which will only work for alphanumeric value,name,special charecter
	String pwd=	NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
	//NumberToTextConverter will help to convert number to text with the help of getNumericCellValue()
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Feufy-Navigation-Advanced-Controllable-Compatible%2Fdp%2FB09VL6BGS8%3Fkeywords%3Drobot%252Bvacuum%252Band%252Bmop%252Bcombo%26qid%3D1669491260%26sprefix%3Drobot%252Bvacuum%252Ban%2Caps%2C353%26sr%3D8-3%26th%3D1%26linkCode%3Dsl1%26tag%3Dforemostlist00-20%26linkId%3Df91f9076135393aac23f070dbb412bd2%26language%3Den_US%26ref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.id("ap_email")).sendKeys(un);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();

	}

}
