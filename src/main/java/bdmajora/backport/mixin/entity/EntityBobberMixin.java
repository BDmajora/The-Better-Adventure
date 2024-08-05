package bdmajora.backport.mixin.entity;


import net.minecraft.core.block.Block;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityBobber;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value = EntityBobber.class, remap = false)
public abstract class EntityBobberMixin extends Entity
{
	public EntityBobberMixin(World world)
	{
		super(world);
	}

}

