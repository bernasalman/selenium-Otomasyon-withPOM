//test edilecek sayfanın objelerinin bulunduğ sınıf

import net.bytebuddy.implementation.bytecode.StackManipulation;
import org.openqa.selenium.*;

public class PracticeFormPage extends BasePage {

    //sayfa içinde kullanılacak elementler tanımlandı
    private final By name= By.id("firstName");
    private final By lastName= By.id("lastName");
    private final By email= By.id("userEmail");

    //element takip edilebilirliğini kolaylaştırmak için sayfa içini farklı alanlara böldük
    public GenderSection genderSection;

    public PracticeFormPage(WebDriver driver){
       super(driver);
       driver.get(baseUrl.concat("automation-practice-form")); //sayfa her çağrıdığında yenisini açmak için
       //driver.manage().window().setSize(new Dimension(768,768)); boyutlandırma
        //uzaklaştırma
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("document.body.style.zoom = '70%'");

        genderSection =new GenderSection(driver);
    }

    public GenderSection genderSection(){
        return this.genderSection;
    }

    public void setName(String nameText){
       /* basePage sınıfı olmadan tekrarlı kod ile
       WebElement nameSpace = driver.findElement(name);
        nameSpace.click();
        nameSpace.sendKeys(nameText);*/

        //basePage sınıfındaki fonk ile
        type(name,nameText);
    }

    public void setLastName(String lastNameText){
       /* WebElement lastnameSpace = driver.findElement(lastName);
        lastnameSpace.click();
        lastnameSpace.sendKeys(lastNameText);*/

        type(lastName, lastNameText);
    }

    public  void setEmail(String emailText){
       /* WebElement emailSpace = driver.findElement(email);
        emailSpace.click();
        emailSpace.sendKeys(emailText); */

        type(email, emailText);
    }

    public String getName(){
        /*WebElement nameSpace = driver.findElement(name);
        //element içine yazılan veriyi alabilmek Attribute kullanılır için
        return nameSpace.getAttribute("value");  */

        return find(name).getAttribute("value");
    }

    public String getlastName(){
        /*WebElement lastnameSpace = driver.findElement(lastName);
        return lastnameSpace.getAttribute("value"); */

        return find(lastName).getAttribute("value");
    }

    public String getMail(){
        /*WebElement mailSpace = driver.findElement(email);
        return mailSpace.getAttribute("value"); */

        return find(email).getAttribute("value");
    }
}
