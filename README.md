

## Kitapyurdu UI Testi - API Testi  
**Kullanılan Teknolojiler:**  
- **Programlama Dili:** Java  
- **Otomasyon Aracı:** Selenium  
- **Test Çerçevesi:** TestNG  
- **Raporlama Aracı:** Allure Report  
- **Tasarım Deseni:** Page Object Model (POM) ve Page Factory  

### Kapsanan Ana Alanlar

**Kullanıcı Kaydı**
- Geçerli ve geçersiz kayıt senaryoları oluşturdum.
- E-posta formatları ve zorunlu alanlar için doğrulama kontrolleri yaptım.
- Boş alanlar ve hatalı veriler için hata mesajlarını kontrol ettim.

**Ürün Arama**
- Ürün arama işlevselliğini test ettim.
- Sonuç vermeyen ve geçersiz girdiler için kenar durumlarını inceledim.

**Alışveriş Sepeti İşlemleri**
- Ürün ekleme işlemlerinin başarı mesajlarını kontrol ettim.
- Sepetten ürün çıkarma işlemlerini test ettim ve doğru bildirimlerin geldiğinden emin oldum.

**Kullanıcı Girişi**
- Geçerli ve geçersiz giriş senaryoları oluşturup uygun hata yönetimini sağladım.

**Şifre Yenileme**
- Şifre yenileme işlevselliğini test etmek için hazırlık yaptım.

### Test Senaryolarının Detaylandırılması

1. **Kullanıcı Kaydı**
   - **Test Senaryosu 1:** Geçerli Veri Gönderimi
   - **Test Senaryosu 2:** Geçersiz E-posta Formatı
   - **Test Senaryosu 3:** Boş Alan Gönderimi
   - **Geliştirmeler:**
     - Maksimum alan uzunlukları ve ek kısıtlamalar (örneğin, şifre gücü) için kontroller eklemeyi planlıyorum.
     - Kayıtlı bir e-posta ile kayıt olma durumunu test etmek için bir senaryo eklemeyi düşünüyorum.

2. **Ürün Arama**
   - **Test Senaryosu 1:** Geçerli Arama Terimi
   - **Test Senaryosu 2:** Sonuç Vermeyen Arama
   - **Test Senaryosu 3:** Geçersiz Arama Girdisi
   - **Geliştirmeler:**
     - Özel karakterler ve SQL enjeksiyonu denemeleriyle güvenlik testleri yapmayı planlıyorum.

3. **Alışveriş Sepeti İşlemleri**
   - **Test Senaryosu 1:** Başarılı Ürün Ekleme
   - **Test Senaryosu 2:** Ürün Çıkarma
   - **Test Senaryosu 3:** Ödeme İçin Limit Uyarısı
   - **Geliştirmeler:**
     - Ürün eklenip çıkarıldığında sepetin toplam fiyatının doğru bir şekilde güncellenip güncellenmediğini kontrol edeceğim.

4. **Kullanıcı Girişi**
   - **Test Senaryosu 1:** Başarılı Giriş
   - **Test Senaryosu 2:** Hatalı Kimlik Bilgileri ile Başarısız Giriş
   - **Geliştirmeler:**
     - Kilitlenmiş veya pasif hesaplarla giriş denemelerini de test etmeyi düşünüyorum.

5. **Şifre Yenileme**
   - Şifre yenileme sürecini test etmek için:
     - Kayıtlı olmayan bir e-posta girişi ile başlamak.
     - Yenileme bağlantısını takip ederek şifre güçlendirme kriterlerini sağlamaya çalışmak.

### Genel Öneriler
- **Dokümantasyon:** Tüm adımları, beklenen sonuçları ve gerçek sonuçları belgelendirmeye özen göstereceğim. Bu, hata örüntülerini belirlememi kolaylaştıracak.
- **Test Kapsamı:** Tüm kritik yolların kapsandığını takip etmeyi ihmal etmeyeceğim.
- **Otomasyon Stratejisi:** Eğer henüz yapmadıysam, otomatik testler için bir CI/CD pipeline’ı uygulamayı düşüneceğim.

### Sonuç
Proje planım, Kitapyurdu platformunun kapsamlı testleri için sağlam bir temel oluşturuyor. Test senaryolarımı geliştirerek ve ek senaryolar keşfederek, test stratejimin sağlamlığını artırmayı hedefliyorum. Bu süreçte yardım veya geri bildirim almak istediğim belirli alanlar varsa, paylaşmaktan çekinmeyeceğim!
