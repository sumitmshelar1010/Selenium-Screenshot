package MainPackage.SeleniumChromeDriver.locators.Screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenShots {//TO GET SCREENSHOT OF WEB PAGE OR WEB ELEMENT

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.amazon.com/");
        File f =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(f,new File("C:\\Users\\ADMIN\\Downloads\\File\\img123.PNG"));
        wd.close();

        /** TakeScreenshot is Interface and It has method getScreenshotAs **/


    }


}
