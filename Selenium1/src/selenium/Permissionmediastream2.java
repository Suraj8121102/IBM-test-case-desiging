package selenium;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permissionmediastream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions option = new ChromeOptions();
HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
HashMap<String, Object> profile = new HashMap<String, Object>();
HashMap<String, Object> prefs = new HashMap<String, Object>();

contentSettings.put("media_stream", 2);
profile.put("managed_default_content_settings", contentSettings);
prefs.put("profile", profile);
option.setExperimentalOption("prefs", prefs);

WebDriver driver = new ChromeDriver();
driver.get("https://mictests.com/");
driver.manage().window().maximize();
	}
}
