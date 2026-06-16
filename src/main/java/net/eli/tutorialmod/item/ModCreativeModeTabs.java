package net.eli.tutorialmod.item;

import net.eli.tutorialmod.TutorialMod;
import net.eli.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DIERALD_STUFF = CREATIVE_MODE_TABS.register("dierald_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIERALD.get()))
                    .title(Component.translatable("creativetab.tutorialmod.dierald_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DIERALD.get());
                        output.accept(ModItems.RAW_DIERALD.get());
                        output.accept(ModBlocks.DIERALD_BLOCK.get());
                        output.accept(ModBlocks.RAW_DIERALD_BLOCK.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> CELESTIAL_BODYS = CREATIVE_MODE_TABS.register("celestial_bodys",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLACK_HOLE.get()))
                    .title(Component.translatable("creativetab.tutorialmod.black_hole"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.NEBULA.get());
                        output.accept(ModItems.NEBULA_FRAGMENT.get());
                        output.accept(ModBlocks.NEBULA_BLOCK.get());
                        output.accept(ModBlocks.NEBULA_FRAGMENT_BLOCK.get());
                        output.accept(ModItems.BLACK_HOLE.get());
                        output.accept(ModBlocks.BLACK_HOLE_BLOCK.get());
                        output.accept(ModItems.SUN.get());
                        output.accept(ModBlocks.SUN_BLOCK.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> SPORT = CREATIVE_MODE_TABS.register("sport",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BASKETBALL.get()))
                    .title(Component.translatable("creativetab.tutorialmod.sport"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BASKETBALL.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }


}
