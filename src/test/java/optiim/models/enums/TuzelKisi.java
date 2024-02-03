package optiim.models.enums;
import lombok.Getter;
public enum TuzelKisi {

    FAAL(2),FAALDEGIL(1);
    @Getter
    private int value;

    private TuzelKisi(int value) {
        this.value = value;
    }
}
