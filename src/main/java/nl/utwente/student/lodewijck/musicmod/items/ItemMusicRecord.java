package nl.utwente.student.lodewijck.musicmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.SoundEvent;
import nl.utwente.student.lodewijck.musicmod.Main;
import nl.utwente.student.lodewijck.musicmod.init.ModItems;
import nl.utwente.student.lodewijck.musicmod.util.IHasModel;

/**
 * Created by Dre on 13-Jul-18.
 */
public class ItemMusicRecord extends ItemRecord implements IHasModel {

    public ItemMusicRecord(String soundName, SoundEvent soundIn, String name) {
        super(soundName, soundIn);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
