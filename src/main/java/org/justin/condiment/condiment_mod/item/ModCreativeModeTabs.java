package org.justin.condiment.condiment_mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.condiment_mod.Condiment_mod;
import org.justin.condiment.condiment_mod.block.ModBlock;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Condiment_mod.MODID);
    public static final RegistryObject<CreativeModeTab> CONDIMENT_MOD_TAB = CREATIVE_MODE_TAB.register("condiment_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MAYO.get()))
                    .title(Component.translatable("creative.condiment_mod_tab"))
                    .displayItems((p_270258_, p_259752_) -> {
                        p_259752_.accept(ModItems.MAYO.get());
                        p_259752_.accept(ModBlock.MAYO_BLOCK.get());
                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
