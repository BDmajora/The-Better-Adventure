package bdmajora.backport.mixin.entity;

import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityItem;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = EntityItem.class, remap = false)
public abstract class EntityItemMixin extends Entity {

	// Fields for stack size handling
	@Unique
	private int previousStackSize;

	@Unique
	private EntityItem thisAs = (EntityItem) (Object) this;

	public EntityItemMixin(World world) {
		super(world);
	}

	// Inject for handling item stack size when player touches the item
	@Inject(method = "playerTouch(Lnet/minecraft/core/entity/player/EntityPlayer;)V",
		at = @At(value = "INVOKE",
			target = "Lnet/minecraft/core/player/inventory/InventoryPlayer;insertItem(Lnet/minecraft/core/item/ItemStack;Z)V",
			shift = At.Shift.BEFORE))
	private void stackSize(EntityPlayer player, CallbackInfo ci) {
		previousStackSize = thisAs.item.stackSize;
	}

	// Inject for water handling from the Better With Aquatic mixin
	@Inject(method = "checkAndHandleWater",
		at = @At("HEAD"),
		cancellable = true)
	public void checkAndHandleWater(boolean addVelocity, CallbackInfoReturnable<Boolean> cir) {
		Entity entity = (Entity) (Object) this;
		cir.setReturnValue(this.world.handleMaterialAcceleration(this.bb, Material.water, entity, addVelocity));
	}

	// Redirect for adjusting entity's movement in water from the Better With Aquatic mixin
	@Redirect(method = "tick",
		at = @At(value = "FIELD",
			target = "Lnet/minecraft/core/entity/EntityItem;yd:D",
			ordinal = 7))
	public double tick(EntityItem instance) {
		if (this.wasInWater) {
			this.yd += 0.045F;
			this.yd *= 0.95f;
		}
		return this.yd;
	}
}
