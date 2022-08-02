import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest{

    @Test
    public void setName(){
       PracticeFormPage practiceFormPage = new PracticeFormPage(driver); //her test birbirinden farklı tarasıyuı sayfalarında ayrı ayrı çalıştırılması gerektiği için
        practiceFormPage.setName("Berna"); //element içine yazılacak gerçek veri
        //expected: testte element içinde olması istenen veri
        Assertions.assertEquals("Berna",practiceFormPage.getName(), "name not correct");
    }

    @Test
    public void setLastName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setLastName("Salman");
        Assertions.assertEquals("Salman",practiceFormPage.getlastName(), "lastname not correct");

    }

    @Test
    public void setEmail(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmail("berna@gmail.com");
        Assertions.assertEquals("berna@gmail.com",practiceFormPage.getMail(), "mail not correct");

    }
}
