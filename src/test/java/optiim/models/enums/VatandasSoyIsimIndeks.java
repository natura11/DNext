package optiim.models.enums;

import lombok.Getter;

public enum VatandasSoyIsimIndeks {
    AYNI(33), FARKLI(32);

    @Getter
    private int value;

    private VatandasSoyIsimIndeks(int value) {
        this.value = value;
    }
}
