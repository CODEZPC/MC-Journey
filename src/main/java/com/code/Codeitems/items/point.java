package com.code.Codeitems.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class point extends Item{
    public point(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        if (stack.getCount() < 10) {
            return TypedActionResult.fail(stack);
        }
        stack.decrement(10);
        ItemStack diamondStack = new ItemStack(Items.DIAMOND);
        PlayerInventory inventory = user.getInventory();
        if (!inventory.insertStack(diamondStack)) {
            user.dropItem(diamondStack, false);
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}