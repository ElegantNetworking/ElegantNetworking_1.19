package hohserg.elegant.networking.test.network;

import hohserg.elegant.networking.api.ClientToServerPacket;
import hohserg.elegant.networking.api.ElegantPacket;
import net.minecraft.server.level.ServerPlayer;

@ElegantPacket
public class ExamplePacket1 implements ClientToServerPacket {
    final int keyCode;

    public ExamplePacket1(int keyCode) {
        this.keyCode = keyCode;
    }

    @Override
    public void onReceive(ServerPlayer player) {
        System.out.println("ExamplePacket1#onReceive keyCode: " + keyCode);
        new ExamplePacket2(player.level.random.nextInt(10)).sendToPlayer(player);
    }
}
