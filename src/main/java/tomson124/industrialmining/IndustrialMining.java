package tomson124.industrialmining;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import tomson124.industrialmining.handler.ConfigurationHandler;
import tomson124.industrialmining.init.ModBlocks;
import tomson124.industrialmining.init.ModItems;
import tomson124.industrialmining.init.ModTileEntities;
import tomson124.industrialmining.init.Recipes;
import tomson124.industrialmining.proxy.IProxy;
import tomson124.industrialmining.reference.Reference;
import tomson124.industrialmining.utility.LogHelper;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTOR_CLASS)
public class IndustrialMining {
    @Mod.Instance(Reference.MOD_ID)
    public static IndustrialMining instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();

        ModBlocks.init();

        ModTileEntities.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        Recipes.init();

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Complete!");

    }

}
