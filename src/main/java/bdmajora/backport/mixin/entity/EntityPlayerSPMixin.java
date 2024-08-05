package bdmajora.backport.mixin.entity;


import bdmajora.backport.interfaces.mixins.IEntityPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.EntityPlayerSP;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = EntityPlayerSP.class, remap = false)
public class EntityPlayerSPMixin implements IEntityPlayer
{

	@Shadow
	protected Minecraft mc;


}
