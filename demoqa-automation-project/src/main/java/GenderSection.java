import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//parçalara ayrılan sayfa elementlerinden gender kısmındaki elementleri içeren sınıf
public class GenderSection extends BasePage {
    private final By maleRadioLabel = new By.ByCssSelector("label[for='gender-radio-1']");
    private final By femaleRadioLabel = new By.ByCssSelector("label[for='gender-radio-2']");
    private final By otherRadioLabel = new By.ByCssSelector("label[for='gender-radio-3']");

    private final By maleRadioButton = By.id("gender-radio-1");
    private final By femaleRadioButton = By.id("gender-radio-2");
    private final By otherRadioButton = By.id("gender-radio-3");


    //sonradan değişirse değişkenlerin adını değiştirmek yeterli olacağından enum kullanıldı
    public enum Genders{MALE, FEMALE, OTHER}
    public GenderSection(WebDriver driver){
        super(driver);
    }

        public void clickRadioButton(Genders gender){
            switch (gender){
                case FEMALE:
                    //driver.findElement(femaleRadioLabel).click();
                    click(femaleRadioLabel); //basePage sınıfından extends edilerek kullanılan fonk
                    break;

                case MALE:
                    //driver.findElement(maleRadioLabel).click();
                    click(maleRadioLabel);
                    break;

                case OTHER:
                    //driver.findElement(otherRadioLabel).click();
                    click(otherRadioLabel);
                    break;}


        }

    public boolean isRadioButtonChecked(Genders gender){
        boolean isChecked = false;
       switch (gender){
           case FEMALE:
               //issChecked = driver.findElement(femaleRadioButton).isSelected();
               isChecked = isSelected(femaleRadioButton); //basePage sınıfındaki fonk ile
               break;

           case MALE:
              // issChecked = driver.findElement(maleRadioButton).isSelected();
               isChecked = isSelected(maleRadioButton);
               break;

           case OTHER:
              // issChecked = driver.findElement(otherRadioButton).isSelected();
               isChecked = isSelected(otherRadioButton);
               break;
       }
       return isChecked;
    }
}
