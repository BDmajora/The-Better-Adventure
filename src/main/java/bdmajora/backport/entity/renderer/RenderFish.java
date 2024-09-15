package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityBaseFish;
import net.minecraft.client.render.entity.LivingRenderer;
import net.minecraft.client.render.model.ModelBase;

public class RenderFish extends LivingRenderer<EntityBaseFish> {
	public RenderFish(ModelBase modelbase, float shadowSize) {
		super(modelbase, shadowSize);
	}
}
