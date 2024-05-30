package org.justin.condiment.condiment_mod.fluid;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.condiment_mod.Condiment_mod;
import org.justin.condiment.condiment_mod.block.ModBlock;
import org.justin.condiment.condiment_mod.item.ModItems;

import java.util.function.Supplier;

    public abstract class ModFluid  {
      public static final DeferredRegister<Fluid> FLUIDS =
              DeferredRegister.create(ForgeRegistries.FLUIDS, Condiment_mod.MODID);

      public static final RegistryObject<FlowingFluid> SOURCE_MAYO_LIQUID = FLUIDS.register("mayo_liquid_fluid",
              () -> new ForgeFlowingFluid.Source(ModFluid.MAYO_LIQUID_FLUID_PROPERTIES));
      public static final RegistryObject<FlowingFluid> FLOWING_MAYO_LIQUID = FLUIDS.register("flowing_mayo_liquid",
              () -> new ForgeFlowingFluid.Flowing(ModFluid.MAYO_LIQUID_FLUID_PROPERTIES));
      public static final ForgeFlowingFluid.Properties MAYO_LIQUID_FLUID_PROPERTIES =  new ForgeFlowingFluid.Properties(
              ModFluidTypes.MAYO_LIQUID_TYPE,SOURCE_MAYO_LIQUID,FLOWING_MAYO_LIQUID)
              .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlock.MAYO_LIQUID).bucket(ModItems.BUCKET_O_MAYO);
        public static void register(IEventBus eventBus){
          FLUIDS.register(eventBus);
      }
    }

