package nl.utwente.student.lodewijck.musicmod.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import nl.utwente.student.lodewijck.musicmod.util.Reference;

/**
 * Created by Dre on 13-Jul-18.
 */
public class Music {

    public static SoundEvent hardbass;

    public static void registerSounds() {
        hardbass = registerSound("hardbass");
    }

    private static SoundEvent registerSound(String soundName) {
        final SoundEvent sound = new SoundEvent(new ResourceLocation(Reference.MOD_ID, soundName)).setRegistryName(new ResourceLocation(Reference.MOD_ID, soundName));
        ForgeRegistries.SOUND_EVENTS.register(sound);
        return sound;
    }
}
