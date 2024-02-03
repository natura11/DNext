package optiim.models.api.musteri;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "erkek_id",
        "kadin_id",
        "ad",
        "soyad",
        "baba_adi",
        "anne_adi",
        "dogum_yeri",
        "dogum_tarihi",
        "meslek_id",
        "egitim_id",
        "gelir_id",
        "cinsiyet",
        "kimlik_tipi_id"
})
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class NufusBilgileri {

    @JsonProperty("erkek_id")
    private Boolean erkekId;
    @JsonProperty("kadin_id")
    private Boolean kadinId;
    @JsonProperty("ad")
    private String ad;
    @JsonProperty("soyad")
    private String soyad;
    @JsonProperty("baba_adi")
    private String babaAdi;
    @JsonProperty("anne_adi")
    private String anneAdi;
    @JsonProperty("dogum_yeri")
    private String dogumYeri;
    @JsonProperty("dogum_tarihi")
    private String dogumTarihi;
    @JsonProperty("meslek_id")
    private String meslekId;
    @JsonProperty("egitim_id")
    private String egitimId;
    @JsonProperty("gelir_id")
    private String gelirId;
    @JsonProperty("cinsiyet")
    private Integer cinsiyet;
    @JsonProperty("kimlik_tipi_id")
    private Integer kimlikTipiId;

    @JsonProperty("erkek_id")
    public Boolean getErkekId() {
        return erkekId;
    }

    @JsonProperty("erkek_id")
    public void setErkekId(Boolean erkekId) {
        this.erkekId = erkekId;
    }

    @JsonProperty("kadin_id")
    public Boolean getKadinId() {
        return kadinId;
    }

    @JsonProperty("kadin_id")
    public void setKadinId(Boolean kadinId) {
        this.kadinId = kadinId;
    }

    @JsonProperty("ad")
    public String getAd() {
        return ad;
    }

    @JsonProperty("ad")
    public void setAd(String ad) {
        this.ad = ad;
    }

    @JsonProperty("soyad")
    public String getSoyad() {
        return soyad;
    }

    @JsonProperty("soyad")
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @JsonProperty("baba_adi")
    public String getBabaAdi() {
        return babaAdi;
    }

    @JsonProperty("baba_adi")
    public void setBabaAdi(String babaAdi) {
        this.babaAdi = babaAdi;
    }

    @JsonProperty("anne_adi")
    public String getAnneAdi() {
        return anneAdi;
    }

    @JsonProperty("anne_adi")
    public void setAnneAdi(String anneAdi) {
        this.anneAdi = anneAdi;
    }

    @JsonProperty("dogum_yeri")
    public String getDogumYeri() {
        return dogumYeri;
    }

    @JsonProperty("dogum_yeri")
    public void setDogumYeri(String dogumYeri) {
        this.dogumYeri = dogumYeri;
    }

    @JsonProperty("dogum_tarihi")
    public String getDogumTarihi() {
        return dogumTarihi;
    }

    @JsonProperty("dogum_tarihi")
    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @JsonProperty("meslek_id")
    public String getMeslekId() {
        return meslekId;
    }

    @JsonProperty("meslek_id")
    public void setMeslekId(String meslekId) {
        this.meslekId = meslekId;
    }

    @JsonProperty("egitim_id")
    public String getEgitimId() {
        return egitimId;
    }

    @JsonProperty("egitim_id")
    public void setEgitimId(String egitimId) {
        this.egitimId = egitimId;
    }

    @JsonProperty("gelir_id")
    public String getGelirId() {
        return gelirId;
    }

    @JsonProperty("gelir_id")
    public void setGelirId(String gelirId) {
        this.gelirId = gelirId;
    }

    @JsonProperty("cinsiyet")
    public Integer getCinsiyet() {
        return cinsiyet;
    }

    @JsonProperty("cinsiyet")
    public void setCinsiyet(Integer cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @JsonProperty("kimlik_tipi_id")
    public Integer getKimlikTipiId() {
        return kimlikTipiId;
    }

    @JsonProperty("kimlik_tipi_id")
    public void setKimlikTipiId(Integer kimlikTipiId) {
        this.kimlikTipiId = kimlikTipiId;
    }

}