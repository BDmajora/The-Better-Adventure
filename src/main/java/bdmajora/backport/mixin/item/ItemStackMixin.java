package bdmajora.backport.mixin.item;

import bdmajora.backport.enchantment.Enchantments;
import bdmajora.backport.enchantment.enchantments.UnbreakingEnchantment;
import bdmajora.backport.utils.EnchantmentUtils;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemBow;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ItemStack.class, remap = false)
public class ItemStackMixin
{

	@ModifyVariable(method = "damageItem", at = @At("HEAD"), ordinal = 0, argsOnly = true)
	int damageItem(int damage)
	{
		if (damage <= 0) return damage;

		int unbreakingLevel = EnchantmentUtils.getLevel((ItemStack)(Object)this, Enchantments.unbreaking);
		if (unbreakingLevel <= 0) return damage;

		for (int i = 0; i < damage; i++)
		{
			if (UnbreakingEnchantment.shouldNegateDamage((ItemStack)(Object)this, unbreakingLevel))
				damage--;
		}

		if (damage < 0)
			damage = 0;

		return damage;
	}


}
