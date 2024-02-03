package optiim.pages.productcatalog;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.Random;

public class MusteriKayitGuncellePage extends PageBase {

    private final WorldHelper worldHelper;

    public static final By cmbAdressIl = By.id("selectIl");
    public static final By cmbAdressIlce = By.id("selectIlce");
    public static final By cmbAdressMahalle = By.id("selectMahalle");
    public static final By cmbAdressSokak = By.id("selectSokak");
    public static final By cmbAdressBina = By.id("selectBina");
    public static final By cmbAdressDaire = By.id("daire-no");
    public static final By cmbVeriIslemeIzni = By.id("veri_isleme_izni");
    public static final By cmbMusteriTipiSec = By.id("musteri_tip_id");
    public static final By txtMusteriKayitTCNo = By.id("tc_no");
    public static final By btnSorgulaSec = By.id("nvi-sorgula-button-id");
    public static final By txtAd = By.cssSelector("div[class='col-6 form-group'] input[id='ad']");
    public static final By txtSoyad = By.cssSelector("div[class='col-6 form-group'] input[id='soyad']");
    public static final By txtBabaAdi = By.cssSelector("div[class='col-6 form-group'] input[id='baba_adi']");
    public static final By txtAnneAdi = By.cssSelector("div[class='col-6 form-group'] input[id='anne_adi']");
    public static final By txtDogumYeri = By.cssSelector("div[class='col-6 form-group'] input[id='dogum_yeri']");
    public static final By txtDogumTarihi = By.cssSelector("div[class='col-6 form-group'] input[id='dogum_tarihi']");
    public static final By btnMusteriKaydet = By.id("musteri-kaydet");
    public static final By txtCepTel = By.id("cep_tel");
    public static final By txtCepTel2 = By.id("cep_tel_diger");
    public static final By txtIsTel = By.id("is_tel");
    public static final By txtEvTel = By.id("ev_tel");
    public static final By cmbBelgeTuru = By.id("belge_turu_id");
    public static final By txtBelgeVerilisTarihi = By.id("belge_verilis_tarih");
    public static final By txtBelgeVerildigiYer = By.id("belge_verildigi_yer");
    public static final By txtBelgeNo = By.id("belge_no");
    public static final By pageMusteriKayitEklemeEkran = By.id("create-or-update-form-id");
    public static final By txtEmail = By.cssSelector("[id='iletisim-bilgileri-form'] [id='email']");
    public static final By btnMusteriGuncelleKaydet = By.id("musteri-update-kaydet");
    public static final By txtTicaretSicilNo = By.id("ticaret_sicil_no");
    public static final By txtVekaletTcNo = By.id("vekalet_tc_no");
    public static final By btnVekaletSorgula = By.id("vekalet_tc_sorgu");
    public static final By chkNviaGuncelle = By.cssSelector("#nvi-lable-id > .custom-control-label");
    public static final By txtSehitGaziTC = By.id("sehit_gazi_tc");
    public static final By txtVergiNo = By.cssSelector("input[name='vergi_nosu']");
    public static final By btnSorgulaVkn = By.id("vedop_sorgu");
    public static final By txtFirmaAdi = By.cssSelector("div[class='tab-pane active'] input[name='firma_adi']");
    public static final By txtVergiIl = By.cssSelector("div[class='tab-pane active'] select[id='tuzel_il']");
    public static final By txtVergiDaire = By.cssSelector("div[class='tab-pane active'] input[id='vergi_dairesi']");
    public static final By txtVekaletKisiAd = By.cssSelector("input[data-error='Vekalet Verilen Kişi boş geçilemez.']");
    public static final By txtVekaletKisiSoyad = By.id("vekalet_verilen_kisi_soyadi");
    public static final By txtVekaletTarihi = By.id("vekalet_tarihi");
    public static final By txtVekaletNo = By.id("vekalet_no");
    public static final By txtVekaletVerilenYer = By.id("vekalet_verilen_yer");
    public static final By btnIkametEkle = By.id("ikametAdresiGuncelle");
    public static final By cmbIkametDaireNo = By.id("selectDaireNo");
    public static final By cmbIkametDaireNoIlkDeger = By.cssSelector("[id='selectDaireNo'] option:nth-child(2)");
    public static final By textIkametAdresiDogrulandı = By.cssSelector("div[class='alert alert-success']");
    public static final By btnIkametSec = By.id("btnIkametSec");
    public static final By kimlikTipiBilgisi = By.id("kimlik_tipi_id");
    public static final By btnMusteriKaydet2 = By.id("musteri-update-kaydet");
    public static final By chkIsitmeEngelliMusteriSec = By.cssSelector("[for='isitme_engelli']");
    public static final By txtIsitmeEngelliMusteriTC = By.id("isitme_engelli_tc");
    public static final By btnPopupIptal = By.cssSelector("button[class='btn btn-default mr-10']");
    public static final By textIkametMusteriNo = By.id("ikamet_bilgileri_form_musteri_id");
    public static final By textSebekeSecim = By.cssSelector("[id='sebeke-sec-modal-id'] [id='exampleModalLabel']");
    public static final By btnKampanyasizTeklif = By.cssSelector("[class='swal2-confirm swal2-styled']");
    public static final By textMusteriNo = By.id("hizmetId");
    public static final By txtKimlikSeriNo = By.id("kimlik_seri_no");
    public static final By uyrukSelect = By.cssSelector("div[class='col-6 form-group'] select[id='uyruk']");
    public static final By checkBoxGormeEngelli = By.id("gorme_engelli");
    public static final By txtgormeEngelliTc = By.id("gorme_engelli_tc");
    public static final By checkBoxIsitmeEngelli = By.id("isitme_engelli");
    public static final By txtisitmeEngelliTc = By.id("isitme_engelli_tc");
    public static final By checkBoxFizikselEngelli = By.id("fiziksel_engelli");
    public static final By txtFizikselEngelliTc = By.id("fiziksel_engelli_tc");
    public static final By checkBoxZihinselEngelli = By.id("zihinsel_engelli");
    public static final By txtZihinselEngelliTc = By.id("zihinsel_engelli_vekaleti_tc");
    public static final By checkBoxSehitGaziYakini = By.id("sehit_gazi");
    public static final By rbtnSureliIsitme =By.id("isitme_engelli_sure_durum_sureli");
    public static final By rbtnSuresizIsitme = By.id("isitme_engelli_sure_durum_suresiz");
    public static final By txtBaslangicTarihiIsitme=By.id("isitme_engelli_baslangic_tarihi");
    public static final By txtBitisTarihiIsitme =By.id("isitme_engelli_bitis_tarihi");
    public static final By rbtnSureliGorme =By.id("gorme_engelli_sure_durum_sureli");
    public static final By rbtnSuresizGorme = By.id("gorme_engelli_sure_durum_suresiz");
    public static final By txtBaslangicTarihiGorme=By.id("gorme_engelli_baslangic_tarihi");
    public static final By txtBitisTarihiGorme =By.id("gorme_engelli_bitis_tarihi");
    public static final By rbtnSureliFiziksel =By.id("fiziksel_engelli_sure_durum_sureli");
    public static final By rbtnSuresizFiziksel = By.id("fiziksel_engelli_sure_durum_suresiz");
    public static final By txtBaslangicTarihiFiziksel=By.id("fiziksel_engelli_baslangic_tarihi");
    public static final By txtBitisTarihiFiziksel =By.id("fiziksel_engelli_bitis_tarihi");
    public static final By rbtnSureliZihinsel =By.id("zihinsel_engelli_sure_durum_sureli");
    public static final By rbtnSuresizZihinsel = By.id("zihinsel_engelli_sure_durum_suresiz");
    public static final By txtBaslangicTarihiZihinsel=By.id("zihinsel_engelli_baslangic_tarihi");
    public static final By txtBitisTarihiZihinsel =By.id("zihinsel_engelli_bitis_tarihi");

    JavascriptExecutor js = (JavascriptExecutor) getWebDriver();

    public MusteriKayitGuncellePage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }
    public MusteriKayitGuncellePage ikametSecimEkraniKapat() throws InterruptedException {
        click(btnPopupIptal);
        log.info("İkamet seçim ekranı kapatıldı.");
        return this;
    }
    public MusteriKayitGuncellePage veriIslemeIzniSec(String veriIslemeIzni) throws InterruptedException {
        selectComboboxByText(cmbVeriIslemeIzni, veriIslemeIzni);
        log.info("Veri işleme izni " + veriIslemeIzni + " olarak seçildi.");
        return this;
    }


    public MusteriKayitGuncellePage musteriTipiSec(String musteriTipi) throws InterruptedException {
        selectComboboxByText(cmbMusteriTipiSec, musteriTipi);
        log.info("Müşteri tipi " + musteriTipi + " olarak seçildi.");
        return this;
    }

    public MusteriKayitGuncellePage tcKimlikNoDoldur(String tckn) {
        clearEnterText(txtMusteriKayitTCNo, tckn);
        log.info("Tc kimlik No " + tckn + " olarak dolduruldu.");
        return this;
    }

    public MusteriKayitGuncellePage musteriGuncelleTcKimlikNoDoluKontrolu() throws InterruptedException {
        log.info("T.C Kimlik No alanının dolu olarak gelmesi kontrolü:");
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtMusteriKayitTCNo));
        String doluTCKN = getValueOfElement(txtMusteriKayitTCNo);
        log.info("Gelen T.C. Kimlik No : " + doluTCKN);
        control((doluTCKN.length() > 0), "T.C. Kimlik No alanının dolu olarak geldi.", "HATA: T.C. Kimlik No alanının dolu olarak gelmedi.");
        return this;
    }

    public MusteriKayitGuncellePage musteriCreateSorgula() throws InterruptedException {
        clickJS(btnSorgulaSec);
        log.info("Sorgula butonu tıklandı.");
        return this;
    }

    public MusteriKayitGuncellePage checkAd(String beklenenAd) throws InterruptedException {
        boolean durum = getValueOfElement(txtAd).length() > 0;
        int i = 0;
        while (!durum) {
            Thread.sleep(2000);
            moveToElement(txtAd);
            durum = getValueOfElement(txtAd).length() > 0;
            i += 2;
            if (i == 40) {
                //log.info("Element gelmemektedir");
                break;
            }
        }

        String gelenAd = getValueOfElement(txtAd);
        log.info("Beklenen Ad: " + beklenenAd);
        log.info("Gelen Ad: " + gelenAd);
        Assert.assertEquals(beklenenAd, gelenAd, "Ad kontrolü başarısız.");
        log.info("Ad kontrolü başarılı.");
        return this;
    }

    public MusteriKayitGuncellePage checkSoyad(String beklenenSoyad) throws InterruptedException {
        isElementExist(txtSoyad);
        moveToElement(txtSoyad);
        String gelenSoyad = getValueOfElement(txtSoyad);
        log.info("Beklenen Soyad: " + beklenenSoyad);
        log.info("Gelen Soyad: " + gelenSoyad);
        Assert.assertEquals(beklenenSoyad, gelenSoyad, "Soyad kontrolü başarısız.");
        log.info("Soyad kontrolü başarılı.");
        return this;
    }

    public MusteriKayitGuncellePage checkBabaAdi(String beklenenBabaAdi) throws InterruptedException {
        isElementExist(txtSoyad);
        moveToElement(txtSoyad);
        String gelenBabaAdi = getValueOfElement(txtBabaAdi);
        log.info("Beklenen Baba Adı: " + beklenenBabaAdi);
        log.info("Gelen Baba Adı: " + gelenBabaAdi);
        Assert.assertEquals(beklenenBabaAdi, gelenBabaAdi, "Baba Adı kontrolü başarısız.");
        log.info("Baba Adı kontrolü başarılı.");
        return this;
    }

    public MusteriKayitGuncellePage checkAnneAdi(String beklenenAnneAdi) throws InterruptedException {
        isElementExist(txtAnneAdi);
        moveToElement(txtAnneAdi);
        String gelenAnneAdi = getValueOfElement(txtAnneAdi);
        log.info("Beklenen Anne Adı: " + beklenenAnneAdi);
        log.info("Gelen Anne Adı: " + gelenAnneAdi);
        Assert.assertEquals(beklenenAnneAdi, gelenAnneAdi, "Anne Adı kontrolü başarısız.");
        log.info("Anne Adi kontrolü başarılı.");
        return this;
    }

    public MusteriKayitGuncellePage checkDogumYeri(String beklenenDogumYeri) throws InterruptedException {
        isElementExist(txtDogumYeri);
        moveToElement(txtDogumYeri);
        String gelenDogumYeri = getValueOfElement(txtDogumYeri);
        log.info("Beklenen Doğum Yeri: " + beklenenDogumYeri);
        log.info("Gelen Doğum Yeri: " + gelenDogumYeri);
        Assert.assertEquals(beklenenDogumYeri, gelenDogumYeri, "Doğum Yeri kontrolü başarısız.");
        log.info("Doğum Yeri kontrolü başarılı.");
        return this;
    }

    public MusteriKayitGuncellePage checkDogumTarihi(String beklenenDogumTarihi) throws InterruptedException {
        isElementExist(txtDogumTarihi);
        moveToElement(txtDogumTarihi);
        String gelenDogumTarihi = getValueOfElement(txtDogumTarihi);
        log.info("Beklnen doğum tarihi: " + beklenenDogumTarihi);
        log.info("Gelen doğum tarihi:" + gelenDogumTarihi);
        Assert.assertEquals(beklenenDogumTarihi, gelenDogumTarihi, "Doğum tarihi kontrolü başarısız.");
        log.info("Doğum tarihi kontrolü başarılı.");
        return this;
    }

    public MusteriKayitGuncellePage musteriCreateSorgula2() throws InterruptedException {
        clickJS(btnSorgulaSec);
        return this;
    }

    public MusteriKayitGuncellePage musteriKayitKaydet() throws InterruptedException {
        js.executeScript("window.scrollBy(0,600)");
        clickJS(btnMusteriKaydet);
        log.info("Müşteri Kayıt / Kaydet butonu tıklandı.");
        return this;
    }

    public MusteriKayitGuncellePage musteriGuncelleKaydet() throws InterruptedException {
        js.executeScript("window.scrollBy(0,750)");
        clickJS(btnMusteriGuncelleKaydet);
        log.info("Musteri Güncelle / Kaydet butonuna tıklandı.");
        return this;
    }

    public MusteriKayitGuncellePage ikametSec() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(btnIkametEkle));
        click(btnIkametEkle);
        log.info("İkamet Seç tıklandı.");
        return this;
    }

    public MusteriKayitGuncellePage cepTelDoldur(String cepTelefonu) throws InterruptedException {

        log.info("Cep Tel:" + cepTelefonu);
        String cepTel;
        if (cepTelefonu.contains("random")) {
            cepTel = "505" + getRandomNumberInRange(1000000, 9999999);
        } else {
            cepTel = cepTelefonu;
        }

        clearText(txtCepTel);
        sendKeys(txtCepTel, cepTel);
        log.info("Cep telefonu girildi. Cep Telefonu:" + cepTel);

        worldHelper.getMusteriPageData().setCepTel(cepTel);

        return this;
    }

    public MusteriKayitGuncellePage cepTel2Doldur(String cepTelefonu2) throws InterruptedException {

        String cepTel2;
        if (cepTelefonu2.contains("random")) {
            cepTel2 = "505" + getRandomNumberInRange(1000000, 9999999);
        } else {
            cepTel2 = cepTelefonu2;
        }

        clearText(txtCepTel2);
        sendKeys(txtCepTel2, cepTel2);
        log.info("Cep telefonu 2 girildi. Cep Telefonu 2:" + cepTel2);

        worldHelper.getMusteriPageData().setCepTel2(cepTel2);

        return this;
    }

    public MusteriKayitGuncellePage isTelDoldur(String isTelefonu) throws InterruptedException {

        String isTel;
        if (isTelefonu.contains("random")) {
            isTel = "312" + getRandomNumberInRange(1000000, 9999999);
        } else {
            isTel = isTelefonu;
        }

        clearText(txtIsTel);
        sendKeys(txtIsTel, isTel);
        log.info("İş telefonu girildi. İş Telefonu:" + isTel);

        worldHelper.getMusteriPageData().setIsTel(isTel);

        return this;
    }

    public MusteriKayitGuncellePage evTelDoldur(String evTelefonu) throws InterruptedException {

        String evTel;
        if (evTelefonu.contains("random")) {
            evTel = "312" + getRandomNumberInRange(1000000, 9999999);
        } else {
            evTel = evTelefonu;
        }

        clearText(txtEvTel);
        sendKeys(txtEvTel, evTel);
        log.info("Ev telefonu girildi. Ev telefonu:" + evTel);

        worldHelper.getMusteriPageData().setEvTel(evTel);

        return this;
    }

    public MusteriKayitGuncellePage ePostaDoldur(String ePosta) throws InterruptedException {

        clearText(txtEmail);
        String mail;
        if (ePosta.contains("random")) {
            mail = "optiim" + getRandomNumberInRange(1000000, 9999999) + "@mailinator.com";
            sendKeys(txtEmail, mail);
            log.info("Eposta " + mail + " olarak girildi.");
        } else {
            mail = ePosta;
            log.info("Eposta boş bırakıldı.");
        }

        worldHelper.getMusteriPageData().setEPosta(mail);

        return this;
    }

    public MusteriKayitGuncellePage ehliyetSec(String belgeTuru) throws InterruptedException {
        selectComboboxByText(cmbBelgeTuru, belgeTuru);
        log.info("Belge türü " + belgeTuru + "´olarak seçildi.");
        return this;
    }

    public MusteriKayitGuncellePage belgeVerilisTarihiGir() throws InterruptedException {
        String gününTarihi = getSysDate();
        js.executeScript("window.scrollBy(0,450)", "");
        sendKeys(txtBelgeVerilisTarihi, gününTarihi);
        log.info("Belge veriliş tarihi girildi. Belge veriliş tarihi:" + gününTarihi);
        return this;
    }

    public MusteriKayitGuncellePage belgeVerildigiYerGir(String verildiğiYer) throws InterruptedException {
        js.executeScript("window.scrollBy(0,450)", "");
        sendKeys(txtBelgeVerildigiYer, verildiğiYer);
        log.info("Belgenin verildiği yer girildi. Belgenin Verildiği Yer:" + verildiğiYer);
        return this;
    }

    public MusteriKayitGuncellePage belgeSeriNoGir(String belgeSeriNo) throws InterruptedException {
        js.executeScript("window.scrollBy(0,450)", "");
        clearText(txtBelgeNo);
        sendKeys(txtBelgeNo, belgeSeriNo);
        log.info("Belge seri no girildi. Belge Seri No:" + belgeSeriNo);
        return this;
    }

    public MusteriKayitGuncellePage ticaretSicilNoDoldur(String ticaretSicilNoStr) throws InterruptedException {

        int ticaretSicilNo;
        clearText(txtTicaretSicilNo);
        String ticariScil = null;
        if (ticaretSicilNoStr.contains("random")) {
            Random r = new Random(System.currentTimeMillis());
            ticaretSicilNo = ((1 + r.nextInt(2)) * 10000000 + r.nextInt(10000000));
            sendKeys(txtTicaretSicilNo, String.valueOf(ticaretSicilNo));
            ticariScil = String.valueOf(ticaretSicilNo);
            log.info("Ticaret sicil no  " + ticaretSicilNo + " olarak girildi.");
        } else {
            ticariScil = ticaretSicilNoStr;
            log.info("Ticaret sicil no bırakıldı.");
        }

        worldHelper.getMusteriPageData().setTicariSicilNo(ticariScil);

        return this;
    }

    public MusteriKayitGuncellePage vekaletTcNoDoldur(String vekaletTcNo) throws InterruptedException {
        clearText(txtVekaletTcNo);
        sendKeys(txtVekaletTcNo, vekaletTcNo);
        log.info("Vekalet tc numarası girildi:" + vekaletTcNo);
        return this;
    }

    public MusteriKayitGuncellePage tcKimlikNoyaGoreSorgula() throws InterruptedException {
        clickJS(btnVekaletSorgula);
        log.info("Tc kimlik numarasına göre sorgula tıklandı.");
        return this;
    }

    public MusteriKayitGuncellePage musteriKayitEkraniKontrolu() {
        control(isElementExist(pageMusteriKayitEklemeEkran), "Müşteri kayıt ekranı geldiği görülür.", "Hata: Müşteri kayıt ekranı gelmedi.");
        return this;
    }

    public MusteriKayitGuncellePage iletisimBilgileriAlaniVeriGirilmedigiKontrolu() {
        log.info("İletişim Bilgileri kısmında veri girişi kontrolü:");
        control(getValueOfElement(txtEvTel).length() == 0, "Ev telefonu alanına veri girilemediği görülür.", "Hata: Ev telefonu alanına veri girildiği görüldü.");
        control(getValueOfElement(txtCepTel).length() == 0, "Cep telefonu alanına veri girilemediği görülür.", "Hata: Cep telefonu alanına veri girildiği görüldü.");
        control(getValueOfElement(txtCepTel2).length() == 0, "Cep telefonu 2 alanına veri girilemediği görülür.", "Hata: Cep telefonu 2 alanına veri girildiği görüldü.");
        control(getValueOfElement(txtIsTel).length() == 0, "İş telefonu alanına veri girilemediği görülür.", "Hata: İş telefonu alanına veri girildiği görüldü.");
        return this;
    }

    public MusteriKayitGuncellePage ikametAdresSecim(String il, String ilce, String mahalle, String caddeSokak, String bina) throws InterruptedException {
        log.info("Adres Bilgileri Giriş:");
        log.info("İl:" + il + " İlçe:" + ilce + " Mahalle:" + mahalle + " Cadde Sokak:" + caddeSokak + " Bina:" + bina);
        selectComboboxByText(cmbAdressIl, il);
        selectComboboxByText(cmbAdressIlce, ilce);
        selectComboboxByText(cmbAdressMahalle, mahalle);
        selectComboboxByText(cmbAdressSokak, caddeSokak);
        selectComboboxByText(cmbAdressBina, String.valueOf(bina));
        selectComboboxByText(cmbIkametDaireNo, getTextOfElement(cmbIkametDaireNoIlkDeger));
        click(btnIkametSec);

        log.info("İkamet adres seçim ekranında adres bilgileri girildi.");

        return this;
    }


    public MusteriKayitGuncellePage ikametAdresiDogrulamaKontrolu(String beklenenMesaj) throws InterruptedException {

        String gelenMesaj = getTextOfElement2(textIkametAdresiDogrulandı);

        log.info("Beklenen Mesaj: " + beklenenMesaj);
        log.info("Gelen Mesaj: " + gelenMesaj);

        Assert.assertEquals(gelenMesaj, beklenenMesaj, "HATA: Müşteri ikamet adresi doğrulandı mesajı görünmedi.");
        log.info("Müşteri ikamet adresi doğrulandı.");

        return this;
    }

    public MusteriKayitGuncellePage belgeBilgileriniGir(String belge_turu, String belge_no, String belge_verilis_tarihi, String belgeVerildigiYer) throws InterruptedException {
        log.info("Belge bilgeleri girme:");

        String createdBelgeNo = createBelgeNo(belge_no);
        String belgeninVerildigiTarih = getBelgeVerilisTarihi(belge_verilis_tarihi);
        String belgeninVerildigiYer = belgeVerildigiYer;

        scrollMainWindow(0, 250);
        waitElement(cmbBelgeTuru);
        selectComboboxByText(cmbBelgeTuru, belge_turu);

        sendKeys(txtBelgeNo, createdBelgeNo);
        sendKeys(txtBelgeVerilisTarihi, belgeninVerildigiTarih);
        sendKeys(txtBelgeVerildigiYer, belgeninVerildigiYer);

        log.info("Belge bilgileri alanında veriler girildi.");
        log.info("Belge Türü:" + belge_turu + " - Belge No:" + createdBelgeNo + " - Belge Veriliş Tarihi:" + belgeninVerildigiTarih + " - Belge Verildiği Yer:" + belgeninVerildigiYer);

        worldHelper.getMusteriPageData().setBelgeNo(createdBelgeNo);
        worldHelper.getMusteriPageData().setBelgeninVerildigiYer(belgeninVerildigiYer);
        worldHelper.getMusteriPageData().setBelgeVerilisTarihi(belgeninVerildigiTarih);

        return this;
    }

    public String createBelgeNo(String belgeNo) throws InterruptedException {

        String belgeSeriNo = null;
        String kimlikNoT = getValueOfElement(kimlikTipiBilgisi);

        if (belgeNo.contains("random")) {
            if (kimlikNoT.contains("1")) {
                belgeSeriNo = "A" + getRandomNumberInRange(10000000, 99999999);
                belgeNo = belgeSeriNo;
            } else if (kimlikNoT.contains("2")) {
                belgeSeriNo = "A" + getRandomNumberInRange(10, 99) + "B" + getRandomNumberInRange(10000, 99999);
                belgeNo = belgeSeriNo;
            }
        } else {
            belgeNo = belgeNo;
        }

        log.info("Belge seri no random olarak yaratıldı. Belge No:" + belgeNo);

        return belgeNo;
    }

    public MusteriKayitGuncellePage musteriBilgisiIsitmeEngellisiOlarakGuncelle(String tckn) throws InterruptedException {
        moveToElement(btnMusteriKaydet2);
        clickJS(chkIsitmeEngelliMusteriSec);
        sendKeys(txtIsitmeEngelliMusteriTC, tckn);
        log.info("Müşteri işitme engelli olarak güncellendi.");
        return this;
    }

    private String getBelgeVerilisTarihi(String belgeVerilisTarihi) {

        if (belgeVerilisTarihi.contains("bugun") || belgeVerilisTarihi.contains("bugün")) {
            belgeVerilisTarihi = getSysDate();
        } else {
            belgeVerilisTarihi = belgeVerilisTarihi;
        }
        return belgeVerilisTarihi;
    }

    public MusteriKayitGuncellePage nvidenGuncelle() throws InterruptedException {

        WebElement option = findElement(chkNviaGuncelle);
        if (!option.isSelected()) {
            click(chkNviaGuncelle);
            log.info("NVI Güncelleme checkboxı seçildi.");
        }
        return this;

    }

    public MusteriKayitGuncellePage sehitGaziTextBoxBosKontrolu() throws InterruptedException {
        String value = getValueOfAttribute(txtSehitGaziTC);
        control(value.isEmpty(), "Şehit/Gazi Bilgisi T.C alanı boş olarak geldiği görüldü.", "HATA: Şehit/Gazi Bilgisi T.C alanı boş olmadığı görüldü.");
        return this;
    }

    public MusteriKayitGuncellePage sehitGaziNoDoldur(String sehitGaziNo) throws InterruptedException {
        String sehitGaziKimlikNo;
        if (sehitGaziNo.contains("random")) {
            sehitGaziKimlikNo = "505" + getRandomNumberInRange(1000000, 9999999);
        } else {
            sehitGaziKimlikNo = sehitGaziNo;
        }

        clearText(txtSehitGaziTC);
        sendKeys(txtSehitGaziTC, sehitGaziKimlikNo);
        log.info("Şehit/Gazi No girildi. Şehit/Gazi No:" + sehitGaziKimlikNo);

        worldHelper.getMusteriPageData().setSehitGaziKimlikNo(sehitGaziKimlikNo);

        return this;
    }

    public MusteriKayitGuncellePage sehitVeyaGaziSec() throws InterruptedException {
        js.executeScript("window.scrollBy(0,500)");
        clickJS2("input[id=\"sehit_gazi\"]");
        log.info("sehitgazi secimi yapildi");
        return this;
    }



    public MusteriKayitGuncellePage oluMusteriBilgieriKontrolu(String ad, String soyad, String olumTarihiGun, String olumTarihiAy, String olumTarihiYil, String durumKod, String durumAciklama) {

        log.info("Müşteri adı : " + ad);
        log.info("Müşteri soyadı : " + soyad);
        log.info("Müşteri Ölüm tarihi gün ay yıl : " + olumTarihiGun + "-" + olumTarihiAy + "-" + olumTarihiYil);
        log.info("Müşteri durum kod : " + durumKod);
        log.info("Müşteri durum açıklama : " + durumAciklama);

        control(durumKod.equals("3"), "Durum kodu kontrolü başarılı.", "Durum kodu kontrolü başarısız.");
        control(durumAciklama.contains("Ölüm"), "Durum açıklama kontrolü başarılı.", "Durum açıklama kontrolü başarısız.");

        return this;
    }


    public MusteriKayitGuncellePage vknDoldur(String vkn) throws InterruptedException {
        clearText(txtVergiNo);
        sendKeys(txtVergiNo, vkn);
        log.info("Vkn girildi:" + vkn);
        return this;
    }

    public MusteriKayitGuncellePage vergiNoyaGoreSorgula() throws InterruptedException {
        click(btnSorgulaVkn);
        log.info("Sorgula butonu tıklandı.");

        return this;
    }

    public MusteriKayitGuncellePage controlFirmaAdApiden(String beklenenFirmaAdi) throws InterruptedException {
        log.info("Firma Adı kontrolü:");
        getDisableText(beklenenFirmaAdi, txtFirmaAdi);
        isElementExist(txtFirmaAdi);
        moveToElement(txtFirmaAdi);
        String gelenFirmaAdi = getValueOfElement(txtFirmaAdi);
        log.info("Beklenen firma adı:" + beklenenFirmaAdi);
        log.info("Gelen firma adı:" + gelenFirmaAdi);
        Assert.assertEquals(beklenenFirmaAdi, gelenFirmaAdi, "HATA: Firma adı kontrolü başarısız.");
        log.info("Firma adi kontrolü başarılı.");
        return this;
    }

    public MusteriKayitGuncellePage controlTuzelILApiden(String beklenenTuzelIl) throws InterruptedException {
        log.info("Firma Adı kontrolü:");
        getDisableText(beklenenTuzelIl, txtVergiIl);
        isElementExist(txtVergiIl);
        moveToElement(txtVergiIl);
        String gelenTuzelIl = getValueOfElement(txtVergiIl);
        log.info("Beklenen tüzel il:" + beklenenTuzelIl);
        log.info("Gelen tüzel il:" + gelenTuzelIl);
        Assert.assertEquals(beklenenTuzelIl, gelenTuzelIl, "HATA: TÜzel il kontrolü başarısız.");
        log.info("TÜzel il kontrolü başarılı.");
        return this;
    }

    public MusteriKayitGuncellePage controlTuzelVergiDairesiApiden(String beklenenVergiDaire) throws InterruptedException {
        log.info("Vergi Dairesi kontrolü:");
        getDisableText(beklenenVergiDaire, txtVergiDaire);
        isElementExist(txtVergiDaire);
        moveToElement(txtVergiDaire);
        String gelenVergiDaire = getValueOfElement(txtVergiDaire);
        log.info("Beklenen vergi daire:" + beklenenVergiDaire);
        log.info("Gelen vergi daire:" + gelenVergiDaire);
        Assert.assertEquals(beklenenVergiDaire, gelenVergiDaire, "HATA: Vergi dairesi kontrol başarısız");
        log.info("Vergi dairesi kontrolü başarılı.");
        return this;
    }


    public MusteriKayitGuncellePage vekatVerilenKisiAdiKontrolu(String olusturulanKisiAdi) throws InterruptedException {

        log.info("Vekalet verilen kişinin adının oluşturulan TC bilgilerine göre geldiği kontrolü:");
        getDisableText(olusturulanKisiAdi, txtVekaletKisiAd);
        isElementExist(txtVekaletKisiAd);
        moveToElement(txtVekaletKisiAd);
        String vekaletVerilenKisiAdi = getValueOfElement(txtVekaletKisiAd);
        log.info("Oluşturulan kişi adı:" + olusturulanKisiAdi);
        log.info("Vekalet verilen kişi adı:" + vekaletVerilenKisiAdi);
        Assert.assertEquals(olusturulanKisiAdi, vekaletVerilenKisiAdi, "HATA:Vekalet verilen kişi adi ve oluşturulan kişi adı aynı değil.");
        log.info("Vekalet verilen kişi adı ve oluşturulan kişi adı kontrolü başarılı.");

        return this;
    }

    public MusteriKayitGuncellePage vekatVerilenKisiSoyadiKontrolu(String oluşturulanKisiSoyadi) throws InterruptedException {

        log.info("Vekalet verilen kişinin soyadının oluşturulan TC bilgilerine göre geldiği kontrolü:");
        getDisableText(oluşturulanKisiSoyadi, txtVekaletKisiSoyad);
        isElementExist(txtVekaletKisiSoyad);
        moveToElement(txtVekaletKisiSoyad);
        String vekaletVerilenKisiSoyadi = getValueOfElement(txtVekaletKisiSoyad);
        log.info("Oluşturulan kişi adı:" + oluşturulanKisiSoyadi);
        log.info("Vekalet verilen kişi adı:" + vekaletVerilenKisiSoyadi);
        Assert.assertEquals(oluşturulanKisiSoyadi, vekaletVerilenKisiSoyadi, "HATA:Vekalet verilen kişi soyadi ve oluşturulan soyadi adı aynı değil.");
        log.info("Vekalet verilen kişi soyadi ve oluşturulan kişi soyadi kontrolü başarılı.");

        return this;
    }

    public MusteriKayitGuncellePage vekakletTarihiGir(String vekaletTarihiStr) throws InterruptedException {

        String vekaletTarihi;
        if (vekaletTarihiStr.contains("bugün")) {
            vekaletTarihi = getSysDate();
        } else {
            vekaletTarihi = vekaletTarihiStr;
        }

        clearText(txtVekaletTarihi);
        sendKeys(txtVekaletTarihi, vekaletTarihi);
        log.info("Vekalet tarihi girildi. Vekalet tarihi:" + vekaletTarihi);

        worldHelper.getMusteriPageData().setVekaletVerilenTarih(vekaletTarihi);

        return this;
    }

    public MusteriKayitGuncellePage vekaletnameNoGir(String vekakletnameNoStr) throws InterruptedException {

        String vekakletnameNo;
        if (vekakletnameNoStr.contains("random")) {
            Random r = new Random(System.currentTimeMillis());
            int vekaletNo = ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
            vekakletnameNo = String.valueOf(vekaletNo);
        } else {
            vekakletnameNo = vekakletnameNoStr;
        }

        clearText(txtVekaletNo);
        sendKeys(txtVekaletNo, vekakletnameNo);
        log.info("Vekaletname No girildi. Vekaletname No:" + vekakletnameNo);

        return this;
    }

    public MusteriKayitGuncellePage vekaletVerilenYerGir(String vekaletVerilenYer) throws InterruptedException {

        sendKeys(txtVekaletVerilenYer, vekaletVerilenYer);
        log.info("Vekalet verilen yer girildi. Vekalet verien yer:" + vekaletVerilenYer);

        worldHelper.getMusteriPageData().setVekaletVerilenYer(vekaletVerilenYer);

        return this;
    }

    public MusteriKayitGuncellePage musteriNoAl(){
        String musteriNumarasi;
        if (isElementExist(textSebekeSecim, 5)) {
            musteriNumarasi = getValueOfElement(textMusteriNo);
        } else {
            musteriNumarasi = getValueOfElement(textIkametMusteriNo);
        }
        log.info("Müşteri numarası alındı. Muşteri Numarası: " + musteriNumarasi);

        worldHelper.getMusteriPageData().setMusteriNo(musteriNumarasi);

        return this;
    }

    public MusteriKayitGuncellePage kimlikSeriNoKontrolu() throws InterruptedException{

        boolean durum = getValueOfElement(txtKimlikSeriNo).length() > 0;
        int i = 0;
        while (!durum) {
            Thread.sleep(2000);
            moveToElement(txtKimlikSeriNo);
            durum = getValueOfElement(txtKimlikSeriNo).length() > 0;
            i += 2;
            if (i == 40) {
                //log.info("Element gelmemektedir");
                break;
            }
        }
        String kimlikSeriNo = getValueOfElement(txtKimlikSeriNo);
        Assert.assertTrue(true,kimlikSeriNo);
        log.info("kimlik seri numarası: " + kimlikSeriNo + "Ekranda geldiği görüldü");
        worldHelper.getMusteriPageData().setKimlikSeriNo(kimlikSeriNo);
        return this;
    }

    public MusteriKayitGuncellePage kimlikSeriNoBosKontrolu() throws InterruptedException {
        String value = getValueOfElement(txtKimlikSeriNo);
        control(value.isEmpty(), "Kimlik Seri No alanı boş olarak geldiği görüldü.", "HATA: Kimlik Seri No alanı boş olmadığı görüldü.");
        return this;
    }


    public MusteriKayitGuncellePage uyrukSelect (String uyruk) throws InterruptedException {
        waitElement(uyrukSelect);
        moveToElement(uyrukSelect);
        selectComboboxByTextContains(uyrukSelect, uyruk);
        log.info("Seçilen uyruk: " + uyruk);
        return this;
    }

}
