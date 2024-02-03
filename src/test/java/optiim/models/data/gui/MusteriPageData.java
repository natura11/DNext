package optiim.models.data.gui;


import lombok.Getter;
import lombok.Setter;

//Müşteri Kayıt ve Müşteri Güncelleme sayfalarını kapsar.
@Getter
@Setter
public class MusteriPageData {

    //Web Parameters
    private String cepTel;
    private String evTel;
    private String isTel;
    private String cepTel2;
    private String ePosta;
    private String ad;
    private String soyad;
    private String babaAdi;
    private String anneAdi;
    private String dogumYeri;
    private String dogumTarihi;
    private String il;
    private String ilce;
    private String koy;
    private String ciltNo;
    private String aileSiraNo;
    private String belgeNo;
    private String belgeVerilisTarihi;
    private String belgeninVerildigiYer;
    private String sehitGaziKimlikNo;
    private String musteriNo;
    private String ticariSicilNo;
    private String vekaletVerilenYer;
    private String vekaletVerilenTarih;
    private Integer nakilGidenIsEmriNo;
    private String devirVerenKsesMacAdres;
    private String devirAlanKsesMacAdres;
    private String devirEdenOntSeriNo;
    private String devirAlanOntSeriNo;
    private String kimlikSeriNo;
    private String numaraBlokIlkDeger;

    public MusteriPageData() {

    }
}
