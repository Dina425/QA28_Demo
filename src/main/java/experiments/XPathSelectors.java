package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathSelectors {
    WebDriver driver=new ChromeDriver();

    @Test
    public void selectorsTextBox(){
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        hideBanner();
        hideFooter();
        WebElement inputFulName= driver.findElement
                        (By.xpath("//input[@id='userName']"));
        inputFulName.clear();
        inputFulName.sendKeys("Monkey");
        WebElement inputEmail=driver.findElement
                (By.xpath("//input[@id='userEmail']"));
        inputEmail.sendKeys("sfsdf@dfgfdg.com");
        WebElement currentAddress=driver.findElement
                (By.xpath("//*[text()='Current Address']"));
        System.out.println(currentAddress.getText());
        WebElement inputCurrentAddress=driver.findElement
                (By.xpath("//*[text()='Current Address']/../..//textarea"));
        inputCurrentAddress.sendKeys("Akko,68");
        WebElement inputPerAdd=driver.findElement
                (By.xpath("//div[@id='permanentAddress-wrapper']" +
                        "                        //textarea"));
        inputPerAdd.sendKeys("Skolkovo");
        WebElement submitButton=driver.findElement
                (By.xpath("//button[text()='Submit']"));
                submitButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement allData=driver.findElement
                        (By.xpath("//div[@id='output']"));
        System.out.println(allData.getText());



        //driver.quit();
    }
    private void hideBanner(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#fixedban').style.display='none'");
    }
    private void hideFooter(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer').style.display='none'");
    }
}
