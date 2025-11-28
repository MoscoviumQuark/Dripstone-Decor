package net.moscoviumquark.dripstonedecor;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.moscoviumquark.dripstonedecor.block.ModBlocks;
import net.moscoviumquark.dripstonedecor.item.ModItems;

@Mod(DripstoneDecor.MOD_ID)
public class DripstoneDecor
{
    public static final String MOD_ID = "dripstonedecor";
    public DripstoneDecor() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            //1st one is what to put the block after in the inventory, 2nd is the block itself.
            event.getEntries().putAfter(Items.REINFORCED_DEEPSLATE.getDefaultInstance(), Items.CALCITE.getDefaultInstance()
                    , CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.CALCITE.getDefaultInstance(), ModBlocks.CALCITE_STAIRS
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.CALCITE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.CALCITE_SLAB
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.CALCITE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.CALCITE_WALL
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.CALCITE_WALL.get().asItem().getDefaultInstance(), Items.DRIPSTONE_BLOCK.getDefaultInstance()
                    , CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DRIPSTONE_BLOCK.getDefaultInstance(), ModBlocks.DRIPSTONE_STAIRS
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.DRIPSTONE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.DRIPSTONE_SLAB
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.DRIPSTONE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.DRIPSTONE_WALL
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.SMOOTH_BASALT.getDefaultInstance(), ModBlocks.SMOOTH_BASALT_STAIRS
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.SMOOTH_BASALT_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.SMOOTH_BASALT_SLAB
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.SMOOTH_BASALT_SLAB.get().asItem().getDefaultInstance(), ModBlocks.SMOOTH_BASALT_WALL
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.BLACKSTONE_WALL.getDefaultInstance(), Items.GILDED_BLACKSTONE.getDefaultInstance()
                    , CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.GILDED_BLACKSTONE.getDefaultInstance(), ModBlocks.GILDED_BLACKSTONE_STAIRS
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.GILDED_BLACKSTONE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.GILDED_BLACKSTONE_SLAB
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.GILDED_BLACKSTONE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.GILDED_BLACKSTONE_WALL
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.END_STONE.getDefaultInstance(), ModBlocks.END_STONE_STAIRS
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.END_STONE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.END_STONE_SLAB
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.END_STONE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.END_STONE_WALL
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.PACKED_MUD.getDefaultInstance(), ModBlocks.PACKED_MUD_STAIRS
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.PACKED_MUD_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.PACKED_MUD_SLAB
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.PACKED_MUD_SLAB.get().asItem().getDefaultInstance(), ModBlocks.PACKED_MUD_WALL
                    .get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
