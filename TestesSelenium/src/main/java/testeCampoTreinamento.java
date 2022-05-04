import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeCampoTreinamento {

    @Test
    public void testeTextField(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("file:///"+ System.getProperty("user.dir")+"/src/main/resources/componentes.html)
        driver.get("C:/Users/tigre/Desktop/JUNIT/TestesSelenium/src/resources/componentes.html");

       // driver.quit();
    }
}
