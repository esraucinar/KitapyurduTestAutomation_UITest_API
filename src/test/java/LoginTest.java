import Base.BaseTest;
import Page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    LoginPage login =new LoginPage();

    @Test(description = "Başarılı Giriş İşlemi")
    public void loginSuccessful() throws InterruptedException{
        login.LoginButton();
        login.email(loginEmail)
                .Password(password);
        login.buttonLogin();
        sleep(7000);
        String actualMessage = login.getHello();
        String expectedMessage = "Merhaba Esra Çınar";
        Assert.assertEquals(actualMessage, expectedMessage, "Mesaj beklenenden farklı!");
    }
    @Test(description = "Başarısız Giriş İşlemi")
    public void loginUnsuccessful() throws InterruptedException {
        login.LoginButton();
        login.email(loginEmail)
                .Password("1234567");
        login.buttonLogin();
        sleep(3000);
        WebElement errorMessageElement = driver.findElement(By.cssSelector(".ky-error"));
        String actualErrorMessage = errorMessageElement.getText().trim();
        String expectedErrorMessage = "E-Posta Adresi ya da şifreniz yanlış. Şifrenizi girerken büyük küçük harf ayrımına dikkat ediniz.";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Hata mesajı beklenenden farklı!");
    }
















}
