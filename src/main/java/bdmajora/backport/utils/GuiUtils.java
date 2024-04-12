package bdmajora.backport.utils;

import bdmajora.backport.backport;
import net.minecraft.client.Minecraft;

public class GuiUtils
{
	public static int getGuiTexture(String texture)
	{
		Minecraft mc = Minecraft.getMinecraft(Minecraft.class);
		return mc.renderEngine.getTexture("/assets/" + backport.MOD_ID + "/gui/" + texture);
	}

}

