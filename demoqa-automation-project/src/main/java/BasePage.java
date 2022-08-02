import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

        protected WebDriver driver;
        String baseUrl = "https://demoqa.com/";

        public BasePage (WebDriver driver){
            this.driver = driver;
        }

     //tekrar eden kodları engellemek için fonksiyonlar yattatıldı

        //elementi bulmak için
        public WebElement find(By locator){
            return driver.findElement(locator);
        }

        //elemente tıklamak için
        public void click(By locator){
            find(locator).click();
        }

        //elemente değer atamak için
        public void type(By locator, String text){
            find(locator).sendKeys(text);
        }

        //elementin seçili olup olmadığını kontrol için
        public Boolean isSelected(By locator){
            return find(locator).isSelected();
        }
}
