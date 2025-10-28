/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.SoundType
 *  net.minecraft.world.level.block.state.BlockBehaviour$Properties
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.material.Material
 *  net.minecraft.world.level.storage.loot.LootContext$Builder
 *  net.minecraftforge.common.util.ForgeSoundType
 */
package net.mcreator.totemsserverhardcore.block;

import java.util.Collections;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.common.util.ForgeSoundType;

public class HojasBlock
extends Block {
    public HojasBlock() {
        super(BlockBehaviour.Properties.of((Material)Material.LEAVES).sound((SoundType)new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.azalea_leaves.break")), () -> new SoundEvent(new ResourceLocation("block.azalea_leaves.step")), () -> new SoundEvent(new ResourceLocation("block.azalea_leaves.place")), () -> new SoundEvent(new ResourceLocation("block.azalea_leaves.hit")), () -> new SoundEvent(new ResourceLocation("block.azalea_leaves.fall")))).strength(1.0f, 10.0f));
    }

    public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }

    public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
        List dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty()) {
            return dropsOriginal;
        }
        return Collections.singletonList(new ItemStack((ItemLike)this, 1));
    }
}

