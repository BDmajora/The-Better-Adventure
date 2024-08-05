package bdmajora.backport.mixin.item;


import net.minecraft.core.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value = ItemStack.class, remap = false)
public class ItemStackMixin
{


}
