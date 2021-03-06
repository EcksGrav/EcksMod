package example.Basicblock;

import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.annotation.Nonnull;

/**
 * User: The Grey Ghost
 * Date: 24/12/2014
 *
 * The Startup classes for this example are called during startup, in the following order:
 *  preInitCommon
 *  preInitClientOnly
 *  initCommon
 *  initClientOnly
 *  postInitCommon
 *  postInitClientOnly
 *  See MinecraftByExample class for more information
 */
public class StartupCommon
{
  public static BlockBasic basicBlock;  // this holds the unique instance of your block
  public static ItemBlock itemBlockBasic;  // this holds the unique instance of the ItemBlock corresponding to your block

  public static void preInitCommon()
  {
    // each instance of your block should have two names:
    // 1) a registry name that is used to uniquely identify this block.  Should be unique within your mod.  use lower case.
    // 2) an 'unlocalised name' that is used to retrieve the text name of your block in the player's language.  For example-
    //    the unlocalised name might be "water", which is printed on the user's screen as "Wasser" in German or
    //    "aqua" in Italian.
    //
    //    Multiple blocks can have the same unlocalised name - for example
    //  +----RegistryName----+---UnlocalisedName----+
    //  |  flowing_water     +       water          |
    //  |  stationary_water  +       water          |
    //  +--------------------+----------------------+
    //
    basicBlock = (BlockBasic)(new BlockBasic().setUnlocalizedName("basic"));
    basicBlock.setRegistryName("basicblockregname");
    ForgeRegistries.BLOCKS.register(basicBlock);

    // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
    itemBlockBasic = new ItemBlock(basicBlock);
    itemBlockBasic.setRegistryName(basicBlock.getRegistryName());
    ForgeRegistries.ITEMS.register(itemBlockBasic);
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }

}
