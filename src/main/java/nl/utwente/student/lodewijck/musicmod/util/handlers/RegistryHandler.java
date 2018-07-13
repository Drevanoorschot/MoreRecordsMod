package nl.utwente.student.lodewijck.musicmod.util.handlers;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import nl.utwente.student.lodewijck.musicmod.init.ModItems;
import nl.utwente.student.lodewijck.musicmod.util.IHasModel;

/**
 * Created by Dre on 13-Jul-18.
 */
@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
      for(Item item : ModItems.ITEMS) {
          if (item instanceof IHasModel) {
              ((IHasModel) item).registerModels();
          }
      }
    }
}
