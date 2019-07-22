package de.maxhenkel.corpse.entities;

import net.minecraft.entity.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.HandSide;

import java.util.Collections;

public class FakeMobEntity extends MobEntity {

    protected FakeMobEntity() {
        super(new EntityType<FakeMobEntity>(null, EntityClassification.MISC, false, false, false, false, EntitySize.fixed(1F, 1F), null, null, null, null), null);

    }

    @Override
    public Iterable<ItemStack> getArmorInventoryList() {
        return Collections.emptyList();
    }

    @Override
    public ItemStack getItemStackFromSlot(EquipmentSlotType slotIn) {
        return ItemStack.EMPTY;
    }

    @Override
    public void setItemStackToSlot(EquipmentSlotType slotIn, ItemStack stack) {

    }

    @Override
    public HandSide getPrimaryHand() {
        return HandSide.RIGHT;
    }
}
