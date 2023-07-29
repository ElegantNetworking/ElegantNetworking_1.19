package hohserg.elegant.networking.test;

import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "elegant_networking", value = Dist.CLIENT)
public class ClientUpdate {

    @SubscribeEvent
    public static void onKeyPress(TickEvent.ClientTickEvent e) {
        //FMLLoader.getNameFunction("mcp");


    }

    @SubscribeEvent
    public static void onKeyPressed(InputEvent.Key event) {
        KeyMapping[] keyHotbarSlots = Minecraft.getInstance().options.keyHotbarSlots;
        for (int i = 0; i < keyHotbarSlots.length; i++) {
            KeyMapping key = keyHotbarSlots[i];
            if (key.isDown()) {
                new PacketPotionHotkey(i).sendToServer();
                return;
            }
        }
    }
}