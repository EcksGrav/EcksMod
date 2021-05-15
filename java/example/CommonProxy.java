package example;

import net.minecraft.entity.player.EntityPlayer;


public abstract class CommonProxy {


  public void preInit()
  {
	example.Basicblock.StartupCommon.preInitCommon();
  }


  public void init()
  {
	example.Basicblock.StartupCommon.preInitCommon();
  }


  public void postInit()
  {
	example.Basicblock.StartupCommon.preInitCommon();
  }

  abstract public boolean playerIsInCreativeMode(EntityPlayer player);


  abstract public boolean isDedicatedServer();
}
