package fr.samlegamer.macawsroofsbop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.samlegamer.macawsroofsbop.block.MRBOPBlocksRegistry;
import fr.samlegamer.macawsroofsbop.item.MRBOPItemsRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsRoofsBOP.MODID)
@Mod.EventBusSubscriber(modid = MacawsRoofsBOP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsRoofsBOP
{
	public static final String MODID = "macawsroofsbop";
	public static final Logger log = LogManager.getLogger();
	
	public MacawsRoofsBOP()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
				
		log.info("Macaw's Roofs - Biome O' Plenty : Loading...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MRBOPItemsRegistry.ITEMS_REGISTRY.register(bus);
		MRBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		log.info("Macaw's Roofs - Biome O' Plenty : Is Charged");
	}
	
	private void setup(FMLCommonSetupEvent event){}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_planks_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_planks_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_planks_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_planks_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_attic_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_planks_attic_roof.get(), RenderType.cutoutMipped());

	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_planks_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_planks_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_planks_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_planks_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_cube_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_planks_cube_roof.get(), RenderType.cutoutMipped());

	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_planks_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_planks_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_planks_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_planks_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_four_way_roof.get(), RenderType.cutoutMipped());
	     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_planks_four_way_roof.get(), RenderType.cutoutMipped());
	
     RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_planks_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_planks_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_planks_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_planks_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_lower_roof.get(), RenderType.cutoutMipped());
   	 RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_planks_lower_roof.get(), RenderType.cutoutMipped());

       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_planks_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_planks_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_planks_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_planks_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_planks_roof.get(), RenderType.cutoutMipped());

       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_planks_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_planks_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_planks_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_planks_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_planks_steep_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_steep_roof.get(), RenderType.cutoutMipped());

       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_planks_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_planks_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_planks_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_planks_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_planks_three_way_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_three_way_roof.get(), RenderType.cutoutMipped());

       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.cherry_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_planks_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.dead_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_planks_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.fir_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.hellbark_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.jacaranda_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_planks_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.magic_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.mahogany_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_planks_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.palm_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.redwood_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_planks_top_roof.get(), RenderType.cutoutMipped());
       RenderTypeLookup.setRenderLayer(MRBOPBlocksRegistry.willow_top_roof.get(), RenderType.cutoutMipped());
	}
}