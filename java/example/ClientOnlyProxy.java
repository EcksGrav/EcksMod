package example;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;


public class ClientOnlyProxy extends CommonProxy
{

  public void preInit()
  {
    super.preInit();
    example.Basicblock.StartupClientOnly.preInitClientOnly();
    }


  public void init()
  {
    super.init();
    example.Basicblock.StartupClientOnly.preInitClientOnly();

  }

  public void postInit()
  {
    super.postInit();
    example.Basicblock.StartupClientOnly.preInitClientOnly();

  }

  @Override
  public boolean playerIsInCreativeMode(EntityPlayer player) {
    if (player instanceof EntityPlayerMP) {
      EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
      return entityPlayerMP.interactionManager.isCreative();
    } else if (player instanceof EntityPlayerSP) {
      return Minecraft.getMinecraft().playerController.isInCreativeMode();
    }
    return false;
  }

  @Override
  public boolean isDedicatedServer() {return false;}

}
