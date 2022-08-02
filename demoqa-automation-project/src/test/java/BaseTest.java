import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//diğer test sınıflarının çağırdığı ana test
//yaptığı tek şey driverı çağırmak
public class BaseTest {
    protected WebDriver driver;
    static String browser = System.getProperty("browser");

    @BeforeAll //herşeden önce yapması gereken anlamında
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe"); web driver manager eklenmeden

        if(browser.equals("edge")){
            WebDriverManager.edgedriver().setup();
        } else if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
        }

        System.out.println("test initiated");
    }

    //her test methodundan önce tarayıcı açmak için
    @BeforeEach
    public void beforeMethod(){
        // driver=new ChromeDriver(); web driver manager eklenmeden

        if(browser.equals("edge")){
            driver = new EdgeDriver();
        } else if (browser.equals("chrome")) {
            driver=new ChromeDriver();
        }

    }

    //her test methodundan sonra tarayıcıyı kapatmak için
    @AfterEach
    public void afterMethod(){
        //driver.quit();
    }

    /*
    @AfterAll //bütün metotlar çalıştıktan sonra anlamında
    public void tearDown(){
        //driver.quit();
        System.out.println("test finished");

    }*/
}
