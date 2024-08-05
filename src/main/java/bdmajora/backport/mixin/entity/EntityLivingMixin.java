package bdmajora.backport.mixin.entity;


import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.util.helper.DamageType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = EntityLiving.class, remap = false)
public class EntityLivingMixin
{
	@Inject(method = "hurt", at = @At(value = "RETURN"))
	public void getHeartsFlashTime(Entity attacker, int damage, DamageType type, CallbackInfoReturnable<Boolean> info)
	{
		if (!(attacker instanceof EntityPlayer)) return;
		EntityPlayer player = (EntityPlayer)attacker;

		EntityLiving thisLiving = (EntityLiving) (Object) this;


	}
}
