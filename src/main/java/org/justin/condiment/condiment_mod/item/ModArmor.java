package org.justin.condiment.condiment_mod.item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;


public abstract class ModArmor extends ArmorItem{

    public ModArmor(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

}
