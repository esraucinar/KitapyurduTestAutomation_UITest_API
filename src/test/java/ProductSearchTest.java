import Base.BaseTest;

import Page.ProductSearchPage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

@Feature("Kitapyurdu.com Ürün Arama")
public class ProductSearchTest extends BaseTest {
    ProductSearchPage searchPage =new ProductSearchPage();

    @Test(description = "Geçerli Bilgilerle Ürün Arama")
    public void ValidStatementSearch() throws InterruptedException{
        searchPage.fillsearch(searchValidWord)
                .clickMagnifyingGlassIcon();
        sleep(3000);
        String value = searchPage.Statement();
        assertEquals("Modern Soslu Postmodern Makarna", value);
    }

    @Test(description = "Belirli Bir Sonuç Üretmeyen Arama")
    public void NotResultSearch() throws InterruptedException{
        searchPage.fillsearch(name)
                .clickMagnifyingGlassIcon();
        sleep(3000);
        boolean sonuc = searchPage.SearchControl(name);
        assertFalse(sonuc, "Arama sonuçları beklenenden farklı. Beklenen sonuç bulunamadı.");
    }

    @Test(description = "Uygun Sonuç Bulunamaması Durumu")
    public void NoSuitableResultFound() throws InterruptedException{
        searchPage.fillsearch(searchInvalidWord);
        sleep(3000);
        searchPage.clickMagnifyingGlassIcon();
        sleep(3000);
        String value = searchPage.notsuitableresult();
        String expectedMessage = "Üzgünüz, aramanıza uygun bir sonuç bulamadık.<br><br>Yazdığınız kelimeyi kontrol ederek tekrar arayabilirsiniz.";
        Assert.assertEquals(value, expectedMessage);
    }
}
