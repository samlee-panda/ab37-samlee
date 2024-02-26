package packagetwo;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_to_amazon_dataprovider
{
@Test(dataProvider="testdata")
public void login(String un, String pwd)
{

	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Feufy-Navigation-Advanced-Controllable-Compatible%2Fdp%2FB09VL6BGS8%3Fkeywords%3Drobot%252Bvacuum%252Band%252Bmop%252Bcombo%26qid%3D1669491260%26sprefix%3Drobot%252Bvacuum%252Ban%2Caps%2C353%26sr%3D8-3%26th%3D1%26linkCode%3Dsl1%26tag%3Dforemostlist00-20%26linkId%3Df91f9076135393aac23f070dbb412bd2%26language%3Den_US%26ref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	driver.findElement(By.id("ap_email")).sendKeys(un);
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys(pwd);
	driver.findElement(By.id("signInSubmit")).click();
}
@DataProvider(name="testdata")
public Object[][] data_for_login()
{
	Object[][] d1= new Object[6][2];
	d1[0][0]="samlee123@gmail.com";//right user name
    d1[0][1]="";//blank password
    		d1[1][0]="samlee123@gmail.com";//right user name
    	    d1[1][1]="AdyaPadhi@12";//Wrong password
    	    		d1[2][0]="sam123@gmail.com ";//wrong username
    	    	    d1[2][1]=" ";//right password
    	    	    		d1[3][0]="sam123@gmail.com";//wrong user name
    	    	    	    d1[3][1]="AdyaPadhi@12";//Wrong password
    	    	    	    		d1[4][0]="";//blank username
    	    	    	    	    d1[4][1]="AdyaPadhi@12 ";//
    	    	    	    	    		d1[5][0]="samlee123@gmail.com ";//right user name
    	    	    	    	    	    d1[5][1]="";//right password
											return d1;
}
}
