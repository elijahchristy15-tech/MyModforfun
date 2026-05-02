package net.eli.tutorialmod.item;

import net.eli.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    //registering items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> DIERALD = ITEMS.register("dierald",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_DIERALD = ITEMS.register("raw_dierald",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NEBULA = ITEMS.register("nebula",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NEBULA_FRAGMENT = ITEMS.register("nebula_fragment",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
