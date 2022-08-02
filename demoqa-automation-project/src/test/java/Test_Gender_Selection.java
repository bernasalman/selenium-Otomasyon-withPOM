import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Gender_Selection extends BaseTest {

    @Test
    public void check_male_radio_button(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.MALE);
        //male radio button seçimi kontrol için
        Assertions.assertTrue(practiceFormPage.genderSection.isRadioButtonChecked(GenderSection.Genders.MALE),
                "male button not checked");
    }

    @Test
    public void check_female_radio_button(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.FEMALE);
        Assertions.assertTrue(practiceFormPage.genderSection.isRadioButtonChecked(GenderSection.Genders.FEMALE),
                "female button not checked");

    }

    @Test
    public void check_other_radio_button(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.OTHER);
        Assertions.assertTrue(practiceFormPage.genderSection.isRadioButtonChecked(GenderSection.Genders.OTHER),
                "other button not checked");
    }
}
