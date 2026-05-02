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

    public static final RegistryObject<CreativeModeTab> DIERALD_ITEMS_TAB = CREATIVE_MODE_TABS.register("dierald_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIERALD.get()))
                    .title(Component.translatable("creativetab.tutorialmod.dierald_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DIERALD.get());
                        output.accept(ModItems.RAW_DIERALD.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> DIERALD_BLOCK_TAB = CREATIVE_MODE_TABS.register("dierald_block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DIERALD_BLOCK.get()))
                    .withTabsBefore(DIERALD_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.tutorialmod.dierald_block"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.DIERALD_BLOCK.get());
                        output.accept(ModBlocks.RAW_DIERALD_BLOCK.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> NEBULA_ITEM_TAB = CREATIVE_MODE_TABS.register("nebula_item_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NEBULA.get()))
                    .title(Component.translatable("creativetab.tutorialmod.nebula_item"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.NEBULA.get());
                        output.accept(ModItems.NEBULA_FRAGMENT.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> NEBULA_BLOCK_TAB = CREATIVE_MODE_TABS.register("nebula_block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.NEBULA_BLOCK.get()))
                    .title(Component.translatable("creativetab.tutorialmod.nebula_block"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.NEBULA_BLOCK.get());
                        output.accept(ModBlocks.NEBULA_FRAGMENT_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }


}
