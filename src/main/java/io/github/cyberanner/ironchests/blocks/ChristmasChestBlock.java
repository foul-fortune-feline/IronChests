package io.github.cyberanner.ironchests.blocks;

import io.github.cyberanner.ironchests.blocks.blockentities.ChristmasChestEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;

public class ChristmasChestBlock extends GenericChestBlock{
    public ChristmasChestBlock() {
        super(FabricBlockSettings.of(Material.WOOD)
                .hardness(50.0F)
                .resistance(1200.0F)
                .sounds(BlockSoundGroup.WOOD)
                .breakByTool(FabricToolTags.AXES, 0)
                .requiresTool());
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ChristmasChestEntity(pos, state);
    }
}
