package net.moscoviumquark.dripstonedecor.block;

import net.minecraft.world.level.block.*;
import net.moscoviumquark.dripstonedecor.DripstoneDecor;
import net.moscoviumquark.dripstonedecor.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DripstoneDecor.MOD_ID);

    public static final RegistryObject<Block> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            () -> new StairBlock(
                    Blocks.DRIPSTONE_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_WALL = registerBlock("dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairBlock(
                    Blocks.CALCITE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CALCITE_WALL = registerBlock("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));

    public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            () -> new StairBlock(
                    Blocks.SMOOTH_BASALT.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)));
    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)));
    public static final RegistryObject<Block> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)));

    public static final RegistryObject<Block> GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            () -> new StairBlock(
                    Blocks.GILDED_BLACKSTONE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));

    public static final RegistryObject<Block> END_STONE_STAIRS = registerBlock("end_stone_stairs",
            () -> new StairBlock(
                    Blocks.END_STONE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final RegistryObject<Block> END_STONE_SLAB = registerBlock("end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final RegistryObject<Block> END_STONE_WALL = registerBlock("end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));

    public static final RegistryObject<Block> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            () -> new StairBlock(
                    Blocks.PACKED_MUD.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final RegistryObject<Block> PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final RegistryObject<Block> PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
