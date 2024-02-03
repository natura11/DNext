package optiim.pages.dcase;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.data.GetData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class CommonPage extends PageBase {

    public CommonPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
    }

    public static final By btnPopupTamam = By.cssSelector("[class='swal2-actions'] button[class='swal2-confirm swal2-styled']");
    public static final By btnPopupTamam2 = By.cssSelector("[class='swal2-actions'] button[class='swal2-cancel swal2-styled']");
    public static final By textPopup = By.cssSelector("[id='swal2-title']");
    public static final By textPopupOnay = By.cssSelector("[id='swal2-content']");
    public static final By btnConfirm = By.cssSelector("[class='swal2-confirm swal2-styled']");
    public static final By btnConfirm2 = By.cssSelector("[class='swal2-cancel swal2-styled']");
    public static final By btnTamamText = By.xpath("//*[@class='swal2-actions']//*[text()='TAMAM']");
    public static final By yeniMusteriPopupEvet = By.cssSelector("[class^='swal2-confirm']");
    public static final By btnHataPopupGeriDon = By.xpath("//*[text()='GERİ DÖN']");
    public static final By btnOnayla = By.cssSelector("[class*='swal2-confirm']");
    public static final By btniptal2 = By.cssSelector("[class='swal2-cancel swal2-styled']");
    public static final By btnAnladımTamam = By.cssSelector("[class='swal2-cancel swal2-styled']");
    public static final By btnMusteriDetayEkranKapat = By.cssSelector("[id='popupWindowLiId'] button");

    public CommonPage popUpKontrol(String beklenenPopupTitleMesaji, String beklenenPopupContentMesaji) throws InterruptedException {
        log.info("Popup mesajı alma ve kontrolü:");

        wait.until(ExpectedConditions.elementToBeClickable(btnPopupTamam));
        waitElement(btnPopupTamam);

        if (beklenenPopupContentMesaji.contains("Uyarı 4: Bekleyen nakil işlemi bulunmaktadır. İşleme devam edilemez..")) {
            Thread.sleep(5000);
            wait.until(ExpectedConditions.elementToBeClickable(btnPopupTamam));
            waitElement(btnPopupTamam);
        }

        String gelenPopupTitleMesaji = getTextOfElement(textPopup);
        String gelenPopupContentMesaji = getTextOfElement(textPopupOnay);

        log.info("Beklenen Popup Mesajı: " + beklenenPopupTitleMesaji + " - " + beklenenPopupContentMesaji);
        log.info("Gelen Popup Mesajı: " + gelenPopupTitleMesaji + " - " + gelenPopupContentMesaji);

        if (gelenPopupTitleMesaji.contains("numaralı hizmete ait cihaz kiralama hizmeti iptal edilecektir")) {
            Assert.assertTrue(gelenPopupTitleMesaji.contains(beklenenPopupTitleMesaji), "HATA: Popup title kontrolü başarısız.");
        } else {
            Assert.assertEquals(gelenPopupTitleMesaji, beklenenPopupTitleMesaji, "HATA: Popup title kontrolü başarısız.");
        }
        log.info("Popup title mesajı kontrolü başarılı: " + gelenPopupTitleMesaji);

        Assert.assertTrue(gelenPopupContentMesaji.contains(beklenenPopupContentMesaji), "HATA: Popup content kontrolü başarısız.");
        log.info("Popup content mesajı kontrolü başarılı: " + beklenenPopupContentMesaji);

        return this;
    }

    public CommonPage popupKontrol(String beklenenPopupMesaji) throws InterruptedException {
        log.info("Popup mesajı alma ve kontrolü:");

        if (beklenenPopupMesaji.contains("Kiralama Arızalı Cihaz Teslim İşlemi Başarı ile Gerçekleştirilmiştir.")) {
            wait.until(ExpectedConditions.elementToBeClickable(btnPopupTamam2));
        } else {
            wait.until(ExpectedConditions.elementToBeClickable(btnPopupTamam));
        }


        String gelenPopupMesaji = getTextOfElement(textPopup);

        log.info("Beklenen Popup Mesajı: " + beklenenPopupMesaji);
        log.info("Gelen Popup Mesajı: " + gelenPopupMesaji);

        if (beklenenPopupMesaji.contains("Kabloses yeni abonelik işlemi başarı ile tamamlandı.") || beklenenPopupMesaji.contains("KabloTv Hizmeti Başarı ile Oluşturuldu.") ||
                beklenenPopupMesaji.contains("Kablonet aboneliği oluşturulmuştur.") || beklenenPopupMesaji.contains("Seri Nolu Cihaz Aboneden İade Alınmıştır. Eksik Teslim Edilen Aksesuarlar Faturalandırılacaktır.")) {
            Assert.assertEquals(gelenPopupMesaji.contains(beklenenPopupMesaji), true, "HATA: Popup kontrolü başarısız.");
        } else {
            Assert.assertEquals(gelenPopupMesaji, beklenenPopupMesaji, "HATA: Popup kontrolü başarısız.");
        }

        log.info("Popup mesajı kontrolÜ başarılı: " + gelenPopupMesaji);

        return this;
    }

    public CommonPage ifNecessaryConfirmClick(String popupMesContent) throws InterruptedException {
        if (popupMesContent.contains("Ölü") || popupMesContent.contains("Seçilen müşteri") ||
                popupMesContent.contains("Belge bilgilerinde") || popupMesContent.contains("Belge No alanında") ||
                popupMesContent.contains("Müşteri kaydı başarı") || popupMesContent.contains("Cep telefonu yanlış") ||
                popupMesContent.contains("Yabancı izin bitiş") || popupMesContent.contains("Uyarı 15") ||
                popupMesContent.contains("Vekalet TC Kimlik No ") || popupMesContent.contains("Devir eden ve devir alan aynı") ||
                popupMesContent.contains("Uyarı 1: Hizmetin altında onaylanmamış (gtt si girilmemiş)") ||
                popupMesContent.contains("Uyarı 4: Bekleyen nakil işlemi bulunmaktadır.") || popupMesContent.contains("Uyarı 7: Bu adreste hizmet bulunmaktadır") ||
                popupMesContent.contains("Tahsilat Kaydedildi") || popupMesContent.contains("Yeni abonelik için şebeke seçim") ||
                popupMesContent.contains("Müşteri güncelle ekranında cep telefonu alanını giriniz.") || popupMesContent.contains("(Filmbox) Müşterinin e-posta adresi başka bir abonelikte kullanılıyor")
                || popupMesContent.contains("Aksesuar seçmeniz gerekiyorsa, ilgili aksesuarları işaretleyerek devam ediniz. (Kumandalarda aksesuar bulunmadığından, aksesuar seçimi yapmadan devam ediniz.") ||
                popupMesContent.contains("numaralı hizmete ait cihaz kiralama hizmeti iptal edilecektir") || popupMesContent.contains("Müşteri telefon iletişim bilgilerinden en az birisi dolu olmalıdır")) {
            click(btnConfirm);
        }

        return this;
    }

    public CommonPage confirmClick(String beklenenPopupMesaji) throws InterruptedException {
        if (!beklenenPopupMesaji.contains("Kiralama Arızalı Cihaz Teslim İşlemi Başarı ile Gerçekleştirilmiştir.")) {
            click(btnConfirm);
        } else {
            click(btnPopupTamam2);

        }

        return this;
    }

    public CommonPage confirmClick() throws InterruptedException {
        click(btnPopupTamam2);
        return this;
    }

    public CommonPage confirmClickKiralamaArizali(String beklenenMesaj) throws InterruptedException {
        // TODO: Bu mesaj geldiği yerde step değiştirilmelidir: "Kiralama Arızalı Cihaz Teslim İşlemi Başarı ile Gerçekleştirilmiştir."
        click(btnConfirm2);
        return this;
    }

    public CommonPage popupTamamSec() throws InterruptedException {
        click(btnPopupTamam);
        log.info("Popup ekranında tamam tıklandı.");
        return this;
    }

    public CommonPage popupTamamSec2() throws InterruptedException {

        if (isElementExist(btnTamamText, 5)) {
            click(btnTamamText);
            log.info("Popup ekranında tamam tıklandı.");
        }

        return this;
    }

    public CommonPage popupEvetSec() throws InterruptedException {
        click(yeniMusteriPopupEvet);
        log.info("Popup ekranında evet tıklandı.");
        return this;
    }

    public CommonPage popupGeriDon() throws InterruptedException {
        click(btnHataPopupGeriDon);
        log.info("Popupdaki geri dön butonu tıklandı.");
        return this;
    }

    public String getFarkliIl(String il) throws InterruptedException {

        int ilKodu = Integer.parseInt(il);
        String[] ilKodlari = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

        if (ilKodu > 20) {
            return ilKodlari[(getRandomNumberInRange(1, 20))];
        } else {
            ilKodlari[ilKodu] = null;
            int index = getRandomNumberInRange(1, 20);

            if (ilKodlari[index] == null) {
                if (index >= 0 && index < 10) index++;
                if (index <= 20 && index >= 10) index--;
            }

            return ilKodlari[index];
        }

    }

    public CommonPage onaylaIptalButonKontrolu() throws InterruptedException {
        log.info("İşlemi Onayla ve İptal butonu kontrolü:");
        control(isElementExist(btnOnayla), "Onayla butonu kontrolü başarılı.", "HATA: Onayla butonu  kontrolü başarısız.");
        control(isElementExist(btniptal2), "İptal butonu kontrolü başarılı.", "HATA: İptal butonu  kontrolü başarısız.");
        return this;
    }

    public CommonPage popupKontrol2(String beklenenPopupMesaji) throws InterruptedException {
        log.info("Popup mesajı alma ve kontrolü:");

        waitElement(textPopup);
        String gelenPopupMesaji = "";
        boolean status = false;
        for (int i = 0; i < GetData.DEFAULT_WAIT; i++) {
            gelenPopupMesaji = getTextOfElement2(textPopup);
            if (gelenPopupMesaji.contains(beklenenPopupMesaji)) {
                status = true;
                break;
            }
            Thread.sleep(1000);
        }

        if (status != true) {
            gelenPopupMesaji = getTextOfElement2(textPopup);
        }

        log.info("Gelen Popup Mesajı: " + gelenPopupMesaji);
        log.info("Beklenen Popup Mesajı: " + beklenenPopupMesaji);
        Assert.assertEquals(gelenPopupMesaji, beklenenPopupMesaji);
        log.info("Popup kontrolu başarılı: " + gelenPopupMesaji);

        return this;
    }


    public CommonPage popupTamam() throws InterruptedException {
        if (isElementExist(btnConfirm, 10)) {
            click(btnConfirm);
            log.info("Popupdaki tamam butonu tıklandı.");
        }
        return this;
    }

    public CommonPage popupAnladimTamam(String uyarıMesaji) throws InterruptedException {
        if (uyarıMesaji.contains("İlgili Kiralama Hizmeti İptal Durumunda Olmalıdır")) {
            elementToBeClickable(btnAnladımTamam);
            moveToElement(btnAnladımTamam);
            click(btnAnladımTamam);
        }
        log.info(uyarıMesaji + " Popup ekranında tamam tıklandı.");
        return this;
    }

    public void musteriDetayPageKapat() {
        click(btnMusteriDetayEkranKapat);
        log.info("Musteri Detay Page ekranı kapatıldı.");
    }

    public void sayfaYenile() {
        getWebDriver().navigate().refresh();
        getWebDriver().manage().timeouts().implicitlyWait(GetData.DEFAULT_WAIT, TimeUnit.SECONDS);
        log.info("Sayfa yenilendi");
    }

    public CommonPage clickRelatedTask() throws InterruptedException {
        Thread.sleep(2000);
        clickJS(By.xpath("//li[3]"));
        log.info("Related Customer Task clicked.");
        return this;
    }

    public CommonPage waitToProcess(String millisecond) throws InterruptedException {
        Thread.sleep(Long.parseLong(millisecond));
        return this;
    }
}
