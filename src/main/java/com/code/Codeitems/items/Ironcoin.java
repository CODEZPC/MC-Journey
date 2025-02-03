package com.code.Codeitems.items;

import com.code.Codeitems.codeitems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Ironcoin extends Item {
    public Ironcoin(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        if (stack.getCount() < 10) {
            stack.decrement(1);
            ItemStack transferStack = new ItemStack(codeitems.COPPERCOIN, 10);
            PlayerInventory inventory = user.getInventory();
            if (!inventory.insertStack(transferStack)) {
                user.dropItem(transferStack, false);
            }
        } else {
            stack.decrement(10);
            ItemStack transferStack = new ItemStack(codeitems.GOLDCOIN);
            PlayerInventory inventory = user.getInventory();
            if (!inventory.insertStack(transferStack)) {
                user.dropItem(transferStack, false);
            }
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
