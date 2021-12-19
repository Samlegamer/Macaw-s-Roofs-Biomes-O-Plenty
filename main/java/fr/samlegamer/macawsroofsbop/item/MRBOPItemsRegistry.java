package fr.samlegamer.macawsroofsbop.item;

import com.mcwroofs.kikoz.MacawsRoofs;

import fr.samlegamer.macawsroofsbop.MacawsRoofsBOP;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MRBOPItemsRegistry
{
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsRoofsBOP.MODID);

	public static final RegistryObject<Item> tile_log_cherry = ITEMS_REGISTRY.register("tile_log_cherry", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_log_dead = ITEMS_REGISTRY.register("tile_log_dead", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_log_fir = ITEMS_REGISTRY.register("tile_log_fir", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_log_hellbark = ITEMS_REGISTRY.register("tile_log_hellbark", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_log_jacaranda = ITEMS_REGISTRY.register("tile_log_jacaranda", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_log_magic = ITEMS_REGISTRY.register("tile_log_magic", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_log_mahogany = ITEMS_REGISTRY.register("tile_log_mahogany", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_log_palm = ITEMS_REGISTRY.register("tile_log_palm", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_log_redwood = ITEMS_REGISTRY.register("tile_log_redwood", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_log_umbran = ITEMS_REGISTRY.register("tile_log_umbran", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_log_willow = ITEMS_REGISTRY.register("tile_log_willow", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	
	public static final RegistryObject<Item> tile_planks_cherry = ITEMS_REGISTRY.register("tile_planks_cherry", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_planks_dead = ITEMS_REGISTRY.register("tile_planks_dead", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_planks_fir = ITEMS_REGISTRY.register("tile_planks_fir", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_planks_hellbark = ITEMS_REGISTRY.register("tile_planks_hellbark", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_planks_jacaranda = ITEMS_REGISTRY.register("tile_planks_jacaranda", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_planks_magic = ITEMS_REGISTRY.register("tile_planks_magic", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_planks_mahogany = ITEMS_REGISTRY.register("tile_planks_mahogany", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_planks_palm = ITEMS_REGISTRY.register("tile_planks_palm", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_planks_redwood = ITEMS_REGISTRY.register("tile_planks_redwood", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_planks_umbran = ITEMS_REGISTRY.register("tile_planks_umbran", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));
	public static final RegistryObject<Item> tile_planks_willow = ITEMS_REGISTRY.register("tile_planks_willow", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs2)));

}