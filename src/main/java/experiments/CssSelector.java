package experiments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelector {
    WebDriver driver=new ChromeDriver();

    @Test
    public void selectorsHomePage(){
        driver.get("https://demoqa.com/");
        //driver.manage().window().maximize();
        driver.quit();
    }


}
