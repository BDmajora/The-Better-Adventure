package bdmajora.backport.mixin.client;


import net.minecraft.client.Minecraft;
import net.minecraft.client.player.controller.PlayerController;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = PlayerController.class, remap = false)
public class PlayerControllerMixin
{
	@Shadow
	@Final
	protected Minecraft mc;
	@Shadow
	protected int blockHitDelay;

}
