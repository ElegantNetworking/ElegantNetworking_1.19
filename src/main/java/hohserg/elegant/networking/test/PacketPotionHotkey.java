package hohserg.elegant.networking.test;

import hohserg.elegant.networking.api.ClientToServerPacket;
import hohserg.elegant.networking.api.ElegantPacket;
import lombok.Value;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;


@ElegantPacket
//@AllArgsConstructor
@Value
public class PacketPotionHotkey implements ClientToServerPacket {
    int potionHotSlot;

    @Override
    public void onReceive(ServerPlayer player) {
        ItemStack stack = player.getInventory().getItem(9 + potionHotSlot);
        if (stack.getItem() == Items.POTION)//если в слоте зелька, то Стив выпьет ее одним глотком :D
        {
            ItemStack stack1 = Items.POTION.finishUsingItem(stack, player.level, player);
            System.out.println(stack1.getCount());
            player.getInventory().setItem(9 + potionHotSlot, stack1);
        }
    }
}
