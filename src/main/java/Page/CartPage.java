package Page;
import Base.BaseTest;
import Page.ProductSearchPage;
import Page.RegisterPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPage extends BaseTest {
    @Step("Arama butonunda çıkan kitabı seçme")
    public CartPage BookSelect(){
        driver.findElement(By.xpath("//*[@id='product-649125']/div[1]/div[2]/a")).click();
        return this;
    }
    @Step("Sepete Ekle Adımı")
    public CartPage AddToCart(){
        driver.findElement(By.id("button-cart")).click();
        return this;
    }
    @Step("Başarılı ikonu görünmelidir")
    public void successfullyIcon(){
        driver.findElement(By.cssSelector("class='swal2-icon swal2-success swal2-icon-show'"));
        screenshot();
    }
    @Step("Sepetim ve sepete git butonuna tıklayın")
    public void cartButton()throws InterruptedException{
        driver.findElement(By.id("sprite-cart-icon")).click();
        sleep(3000);
        driver.findElement(By.id("js-cart")).click();
    }

    @Step("Çarpı ikonuna tıklayın")
    public void crossClick(){
        driver.findElement(By.cssSelector("[class='fa fa-times red-icon']")).click();
        screenshot();
        //kaldırıldı mesajı görülüyor.
    }
    @Step("Sepetinizden çıkarılıyor, uyarı mesajının görüntülenmesi")
    public String messageExitCart() {
        // Uyarı mesajını id ile bul
        WebElement messageElement = driver.findElement(By.id("swal2-title"));

        // Mesaj metnini al, başında ve sonundaki boşlukları kaldırarak döndür
        String messageText = messageElement.getText().trim();

        // Ekran görüntüsü al
        screenshot();

        // Mesajı geri döndür
        return messageText;
    }
    @Step("Sipariş verebilmeniz için sepet tutarı en az 100,00 olmalıdır.")
    public String alertLimit() {
        String value = driver.findElement(By.xpath("//div[@class='alert dismissable warning']")).getText().trim();
        return value;
    }




}


