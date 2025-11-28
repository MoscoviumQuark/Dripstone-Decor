package net.moscoviumquark.dripstonedecor;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.moscoviumquark.dripstonedecor.block.ModBlocks;
import net.moscoviumquark.dripstonedecor.item.ModItems;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(DripstoneDecor.MOD_ID)
public class DripstoneDecor {
    public static final String MOD_ID = "dripstonedecor";
    public static final Logger LOGGER = LogUtils.getLogger();


    public DripstoneDecor(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            //1st one is what to put the block after in the inventory, 2nd is the block itself.
            event.insertAfter(Items.REINFORCED_DEEPSLATE.getDefaultInstance(), Items.CALCITE.getDefaultInstance()
                    , CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.CALCITE.getDefaultInstance(), ModBlocks.CALCITE_STAIRS
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModBlocks.CALCITE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.CALCITE_SLAB
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModBlocks.CALCITE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.CALCITE_WALL
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.CHISELED_TUFF_BRICKS.getDefaultInstance(), Items.DRIPSTONE_BLOCK.getDefaultInstance()
                    , CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.DRIPSTONE_BLOCK.getDefaultInstance(), ModBlocks.DRIPSTONE_STAIRS
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModBlocks.DRIPSTONE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.DRIPSTONE_SLAB
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModBlocks.DRIPSTONE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.DRIPSTONE_WALL
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.SMOOTH_BASALT.getDefaultInstance(), ModBlocks.SMOOTH_BASALT_STAIRS
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModBlocks.SMOOTH_BASALT_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.SMOOTH_BASALT_SLAB
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModBlocks.SMOOTH_BASALT_SLAB.get().asItem().getDefaultInstance(), ModBlocks.SMOOTH_BASALT_WALL
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.remove(
                    Items.GILDED_BLACKSTONE.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.BLACKSTONE_WALL.getDefaultInstance(), Items.GILDED_BLACKSTONE.getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(Items.GILDED_BLACKSTONE.getDefaultInstance(), ModBlocks.GILDED_BLACKSTONE_STAIRS
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModBlocks.GILDED_BLACKSTONE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.GILDED_BLACKSTONE_SLAB
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModBlocks.GILDED_BLACKSTONE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.GILDED_BLACKSTONE_WALL
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.END_STONE.getDefaultInstance(), ModBlocks.END_STONE_STAIRS
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModBlocks.END_STONE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.END_STONE_SLAB
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModBlocks.END_STONE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.END_STONE_WALL
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.PACKED_MUD.getDefaultInstance(), ModBlocks.PACKED_MUD_STAIRS
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModBlocks.PACKED_MUD_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.PACKED_MUD_SLAB
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModBlocks.PACKED_MUD_SLAB.get().asItem().getDefaultInstance(), ModBlocks.PACKED_MUD_WALL
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
    
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
