package hohserg.elegant.networking.test;

import com.google.common.collect.HashBiMap;
import hohserg.elegant.networking.api.ElegantPacket;
import hohserg.elegant.networking.api.ServerToClientPacket;
import lombok.Data;
import net.minecraft.client.Minecraft;

//@ElegantPacket
@Data
public class GuavaTest implements ServerToClientPacket {
    HashBiMap<String, Integer> biMap;

    TestA testA;
    TestB<Integer> testB;


    @Override
    public void onReceive(Minecraft mc) {

    }

    public static class TestA {
    }

    public static class TestB<I> {
        I v;
    }
}
