package bdmajora.backport.mixin.world;


import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.projectile.EntityArrow;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = World.class, remap = false)
public class WorldMixin
{

}
