package nl.utwente.student.lodewijck.musicmod.init;

import net.minecraft.item.Item;
import nl.utwente.student.lodewijck.musicmod.items.ItemMusicRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dre on 13-Jul-18.
 */
public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item HARDBASS_DISC = new ItemMusicRecord("hardbass", Music.hardbass, "hardbassrecord");


}
