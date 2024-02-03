package optiim.models.enums;

import lombok.Getter;

public enum VatandasIzinDurumu {
    IZINBILGILERIYOK(1),IZINSURESIGECMIS(2),SURESIZ(3);

    @Getter
    private int value;

    private VatandasIzinDurumu(int value) {
        this.value = value;
    }
}
