package nl.utwente.student.lodewijck.musicmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nl.utwente.student.lodewijck.musicmod.Main;
import nl.utwente.student.lodewijck.musicmod.init.ModItems;
import nl.utwente.student.lodewijck.musicmod.util.IHasModel;

/**
 * Created by Dre on 13-Jul-18.
 */
public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
        ModItems.ITEMS.add(this);
    }


    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
