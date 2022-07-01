package hohserg.elegant.networking.test;

import hohserg.elegant.networking.api.ElegantSerializable;
import hohserg.elegant.networking.api.IByteBufSerializable;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

@ElegantSerializable
@Data
@Getter(AccessLevel.PRIVATE)
public class Test implements IByteBufSerializable {
    int a;
    boolean lol;
    Boolean kek;
    Boolean isBruh;
}
