package optiim.pages.dcase;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;

public class SwitchUserPage extends PageBase {
    public static final By txtBul = By.xpath("//*[@id='kullanicilar_filter']/input");
    public static final By chkKullanici = By.name("tb_kullanici");
    private final WorldHelper worldHelper;

    public SwitchUserPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;

    }

//    public SwitchUserPage kullaniciBul(SorgulaYetkiyeGoreKullaniciData kullanici) {
//
//        frameToBeAvailableAndSwitchToIt(By.tagName("iframe"));
//
//        clearEnterText(txtBul, kullanici.getKullaniciId() + " " +
//                kullanici.getKullaniciAd() + " " +
//                kullanici.getKullaniciSoyad());
//
//        log.info("Kullanıcı bulundu. Kullanıcı Adı:" + kullanici.getKullaniciAd() + " - " + "Kullanıcı Soyadı:" + kullanici.getKullaniciSoyad());
//
//        return this;
//    }

    public SwitchUserPage kullaniciSec() {
        click(chkKullanici);
        switchAndExceptAlert();
        log.info("Yeni kullanıcıya switch edildi.");
        return this;
    }


    public SwitchUserPage kullaniciBul2(String kullanici) {
        frameToBeAvailableAndSwitchToIt(By.tagName("iframe"));

        clearEnterText(txtBul, kullanici);

        log.info("Kullanıcı bulundu. Kullanıcı Bilgileri:" + kullanici);

        return this;
    }
}
