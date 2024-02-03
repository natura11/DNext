package optiim.steps.api.testAuto;

import optiim.framework.helpers.ApiHelper;
import optiim.framework.helpers.WorldHelper;

public class KontrolTabloSteps extends ApiHelper {
    private final WorldHelper worldHelper;

    public KontrolTabloSteps(WorldHelper worldHelper) {
        this.worldHelper = worldHelper;
    }

//    @DataTableType
//    public KontrolTabloRequest kontrolTabloEntry(Map<String, String> entry) throws InterruptedException {
//
//        return new KontrolTabloRequest(
//                Integer.parseInt(entry.get("user_id")),
//                entry.get("kontrol_adi"),
//                entry.get("key1"),
//                (entry.get("key2") == null) ? null : "");
//    }
//
//
//    @Eğerki("{string} hizmeti için bugünki toplam SMS sayısını kontrol etmek istersem")
//    public void hizmeti_için_bugünki_toplam_SMS_sayısını_kontrol_etmek_istersem(String hizmetTuru) {
//        String hizmetId = worldHelper.getHizmetDataByHizmetTuru(TypeConversion.valueOf(HizmetTuru.class, hizmetTuru, null)).getId().toString();
//        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "SMSBUGUN", hizmetId, null);
//        worldHelper.setSmsKontrolResponse(TestAutoApi.kontrolTablo(kontrolTabloRequest, SMSKontrolResponse.class));
//    }
//
//    @Ozaman("bugün gönderilen toplam SMS'nin {int} olduğunu görürüm")
//    public void bugün_gönderilen_toplam_SMSnin_olduğunu_görürüm(Integer int1) {
//        Assert.assertEquals(worldHelper.getSmsKontrolResponse().getData().get(0).getToplamSms(), int1, "HATA:Toplam sms sayısı kontrolü başarısız.");
//    }
//
//    @Eğerki("musteri tablosunda TC kimlik ve müşteri numarasına göre sorgulama yaparsam")
//    public void musteri_tablosunda_TC_kimlik_ve_müşteri_numarasına_göre_sorgulama_yaparsam() throws InterruptedException {
//        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "MUSTERI", worldHelper.getKisiSorgulaResponse().getTcKimlikNo(), worldHelper.getMusteriPageData().getMusteriNo());
//        worldHelper.setMusteriKontrolResponse(TestAutoApi.kontrolTablo(kontrolTabloRequest, MusteriKontrolResponse.class));
//    }
//
//    @Eğerki("musteri tablosunda TC kimlik ve oluşturulan müşteri numarasına göre sorgulama yaparsam")
//    public void musteri_tablosunda_TC_kimlik_ve_oluşturulan_müşteri_numarasına_göre_sorgulama_yaparsam() throws InterruptedException {
//        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "MUSTERI", worldHelper.getKisiSorgulaResponse().getTcKimlikNo(), worldHelper.getMusteriOlusturResponse().getData().toString());
//        worldHelper.setMusteriKontrolResponse(TestAutoApi.kontrolTablo(kontrolTabloRequest, MusteriKontrolResponse.class));
//    }
//
//    @Eğerki("nufüs tablosunda TC kimlik numarasına göre sorgulama yaparsam")
//    public void nufüs_tablosunda_TC_kimlik_numarasına_göre_sorgulama_yaparsam() throws InterruptedException {
//        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "NUFUS", worldHelper.getKisiSorgulaResponse().getTcKimlikNo(), null);
//        worldHelper.setNufusKontrolResponse(TestAutoApi.kontrolTablo(kontrolTabloRequest, NufusKontrolResponse.class));
//    }
//
//    @Eğerki("musteri tablosunda vergi no ve müşteri numarasına göre sorgulama yaparsam")
//    public void musteri_tablosunda_vergi_no_ve_müşteri_numarasına_göre_sorgulama_yaparsam() throws InterruptedException {
//        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "TUZELMUSTERI", worldHelper.getVknOlusturResponse().getData(), worldHelper.getMusteriPageData().getMusteriNo());
//        worldHelper.setTuzelMusteriKontrolResponse(TestAutoApi.kontrolTablo(kontrolTabloRequest, TuzelMusteriKontrolResponse.class));
//    }
//
////    @Eğerki("{string} için ses kuyruk sorgularsam")
////    public void ses_kuyruk_sorgularsam(String hizmetTuru) {
////        String hizmetId = worldHelper.getHizmetDataByHizmetTuru(TypeConversion.valueOf(HizmetTuru.class, hizmetTuru,null)).getId().toString();
////       // String hizmetId = worldHelper.getHizmetDataByHizmetTuru("KABLOSES-NCS").getId().toString();
////        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "SESKUYRUK", hizmetId, "23");
////        worldHelper.setSesKuyrukResponse(TestAutoApi.kontrolTablo(kontrolTabloRequest, SesKuyrukResponse.class));
////    }
//
//    @Eğerki("{string} hizmetinin iş emri ücret sorgularsam")
//    public void hizmetinin_iş_emri_ücret_sorgularsam(String hizmetTuru) {
//        String hizmetId = worldHelper.getHizmetDataByHizmetTuru(TypeConversion.valueOf(HizmetTuru.class, hizmetTuru, null)).getId().toString();
//        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "ISEMRIUCRET", hizmetId, null);
//        worldHelper.setIsEmriUcretResponse(TestAutoApi.kontrolTablo(kontrolTabloRequest, IsEmriUcretResponse.class));
//    }
//
//    @Eğerki("nakil gelen {string} hizmetinin iş emri ücret sorgularsam")
//    public void nakil_gelen_hizmetinin_iş_emri_ücret_sorgularsam(String hizmetTuru) {
//        String hizmetId = worldHelper.getHizmetDataByHizmetTuru(TypeConversion.valueOf(HizmetTuru.class, hizmetTuru, null)).getId().toString();
//        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "ISEMRIUCRET", hizmetId, null);
//        worldHelper.setIsEmriUcretResponse(TestAutoApi.kontrolTablo(kontrolTabloRequest, IsEmriUcretResponse.class));
//    }
//
//    @Eğerki("devir alan {string} hizmetinin iş emri ücret sorgularsam")
//    public void devir_alan_hizmetinin_iş_emri_ücret_sorgularsam(String hizmetTuru) {
//        String hizmetId = worldHelper.getHizmetDataByHizmetTuru2(TypeConversion.valueOf(HizmetTuru.class, hizmetTuru, null)).getId().toString();
//        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "ISEMRIUCRET", hizmetId, null);
//        worldHelper.setIsEmriUcretResponse(TestAutoApi.kontrolTablo(kontrolTabloRequest, IsEmriUcretResponse.class));
//    }
//
//    @Eğerki("KTV hizmetinin smart kart teslim sorgularsam")
//    public void hizmetinin_smart_kart_teslim_sorgularsam() {
//        String hizmetId = worldHelper.getHizmetDataByHizmetTuru(HizmetTuru.KTV).getId().toString();
//        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "SMARTCARDTESLIM", hizmetId, null);
//        worldHelper.setSmartCardTeslimResponse(TestAutoApi.kontrolTablo(kontrolTabloRequest, SmartCardTeslimResponse.class));
//    }
//
//    @Ozaman("iş emri ücretlerinde ücret türü {string} ücret miktar {string} girildiğini görürüm")
//    public void iş_emri_ücretlerinde_ücret_türü_ücret_miktar_girildiğini_görürüm(String ucretTuruStr, String ucretMiktar) {
//        UcretTuru ucretTuru = TypeConversion.valueOf(UcretTuru.class, ucretTuruStr, null);
//
//        if (ucretTuruStr.contains("DEVİR")) {
//            Assert.assertEquals("" + ucretTuru.getValue(), "" + worldHelper.getIsEmriUcretResponse().getData().get(0).getUcretTuruId(), "HATA: İş emri ücretlerinde ucret türü " + ucretTuruStr + "bulunamadı!");
//            Assert.assertEquals("" + ucretMiktar, "" + worldHelper.getIsEmriUcretResponse().getData().get(0).getUcretMiktar(), "HATA: İş emri ücretlerinde ucret miktarı " + ucretMiktar + "bulunamadı!");
//
//        } else if (ucretTuruStr.contains("NAKİLGELEN")) {
//            Assert.assertEquals("" + ucretTuru.getValue(), "" + worldHelper.getIsEmriUcretResponse().getData().get(0).getUcretTuruId(), "HATA: İş emri ücretlerinde ucret türü " + ucretTuruStr + "bulunamadı!");
//            Assert.assertEquals("" + ucretMiktar, "" + worldHelper.getIsEmriUcretResponse().getData().get(0).getUcretMiktar(), "HATA: İş emri ücretlerinde ucret miktarı " + ucretMiktar + "bulunamadı!");
//
//        }
//    }
//
//    @Eğerki("nakil gelen {string} müşteri hizmet kampanya sorgularsam")
//    public void nakil_gelen_müşteri_hizmet_kampanya_sorgularsam(String hizmetTuru) {
//        String hizmetId = worldHelper.getHizmetDataListByHizmetTuru(TypeConversion.valueOf(HizmetTuru.class, hizmetTuru, null)).get(0).getId().toString();
//        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "MUSTERIHIZMETKAMPANYA", hizmetId, null);
//        worldHelper.setMusteriHizmetKampanyaResponse(TestAutoApi.kontrolTablo(kontrolTabloRequest, MusteriHizmetKampanyaResponse.class));
//    }
//
//    @Eğerki("nakil giden {string} müşteri hizmet kampanya sorgularsam")
//    public void nakil_giden_müşteri_hizmet_kampanya_sorgularsam(String hizmetTuru) {
//        String hizmetId = worldHelper.getHizmetDataByHizmetTuru2(TypeConversion.valueOf(HizmetTuru.class, hizmetTuru, null)).getId().toString();
//        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "MUSTERIHIZMETKAMPANYA", hizmetId, null);
//        worldHelper.setMusteriHizmetKampanya2Response(TestAutoApi.kontrolTablo(kontrolTabloRequest, MusteriHizmetKampanyaResponse.class));
//    }
//
//    @Eğerki("devir alan müşterinin fatura teslim şekli bilgisini sorgularsam")
//    public void devirAlanMüşterininFaturaTeslimŞekliBilgisiniSorgularsam() {
//
//        int musteriNo = worldHelper.getMusteriOlustur2Response().getData();
//
//        String hizmetIdDevirAlan = "" + worldHelper.getMusteriHizmetler2Response().getData().get(0).getHizmetNo();
//        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "MUSTERIHIZMET", hizmetIdDevirAlan, String.valueOf(musteriNo));
//        worldHelper.setMusteriHizmetKontrolResponse(TestAutoApi.kontrolTablo(kontrolTabloRequest, MusteriHizmetKontrolResponse.class));
//    }
//
//    @Eğerki("{string} hizmeti için kampanya hizmet kredi sorgularsam")
//    public void hizmeti_için_kampanya_hizmet_kredi_sorgularsam(String hizmetTuru) {
//        String hizmetId = "" + TypeConversion.valueOf(HizmetTuru.class, hizmetTuru, null).getValue();
//        String kampanyaID = worldHelper.getSorgulaKampanyaResponse().getData().get(0).getId().toString();
//        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "KAMPANYAHIZMETKREDI", hizmetId, kampanyaID);
//        worldHelper.setKampanyaHizmetKrediResponse(TestAutoApi.kontrolTablo(kontrolTabloRequest, KampanyaHizmetKrediResponse.class));
//    }
//
//    @Eğerki("müşterinin şebeke türü ve fatura teslim şekli bilgisini sorgularsam")
//    public void müşterinin_şebeke_ve_fatura_teslim_şekli_bilgisini_sorgularsam() {
//        String hizmetId;
//        int musteriNo = worldHelper.getMusteriOlusturResponse().getData();
//        int hizmetlerSize = worldHelper.getMusteriHizmetlerResponse().getData().size();
//        if (hizmetlerSize == 1) {
//            hizmetId = "" + worldHelper.getMusteriHizmetlerResponse().getData().get(0).getHizmetNo();
//        } else {
//            hizmetId = "" + worldHelper.getMusteriHizmetlerResponse().getData().get(hizmetlerSize - 1).getHizmetNo();
//        }
//        KontrolTabloRequest kontrolTabloRequest = new KontrolTabloRequest(1, "MUSTERIHIZMET", hizmetId, String.valueOf(musteriNo));
//        worldHelper.setMusteriHizmetKontrolResponse(TestAutoApi.kontrolTablo(kontrolTabloRequest, MusteriHizmetKontrolResponse.class));
//    }
//

}
