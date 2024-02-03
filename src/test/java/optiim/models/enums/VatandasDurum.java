package optiim.models.enums;

import lombok.Getter;

public enum VatandasDurum {
    YASAYAN(1), OLU(0);

    @Getter
    private int value;

    private VatandasDurum(int value) {
        this.value = value;
    }
}
