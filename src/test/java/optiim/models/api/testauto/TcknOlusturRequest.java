package optiim.models.api.testauto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "user_id",
        "yas",
        "musteri_tipi",
        "durum",
        "soyisim_indeks",
        "izin_durumu",
        "adres_dogrulanabilir",
        "kimlik_seri_no"
})
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
public class TcknOlusturRequest {

    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("yas")
    private Integer yas;
    @JsonProperty("musteri_tipi")
    private Integer musteriTipi;
    @JsonProperty("durum")
    private Integer durum;
    @JsonProperty("soyisim_indeks")
    private Integer soyisimIndeks;
    @JsonProperty("izin_durumu")
    private Integer izinDurumu;
    @JsonProperty("adres_dogrulanabilir")
    private Boolean adresDogrulanabilir;
    @JsonProperty("kimlik_seri_no")
    private Integer kimlikSeriNo;
}
