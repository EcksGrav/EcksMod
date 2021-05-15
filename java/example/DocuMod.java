package example;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DocuMod.MODID, name = DocuMod.MODNAME, version = DocuMod.MODVERSION)
public class DocuMod
{
	public static final String MODID ="example";
	public static final String MODVERSION = "0.0.1";
	public static final String MODNAME = "documentamod";
	
    @SidedProxy(clientSide = "example.ClientOnlyProxy", serverSide = "example.DedicatedServerProxy")
    public static CommonProxy proxy;

	
	@Mod.Instance(DocuMod.MODID)
	public static DocuMod instance;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
      proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
      proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit();
    }
}