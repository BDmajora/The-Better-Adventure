package bdmajora.backport.entity.renderer;

import bdmajora.backport.entity.EntityDrowned;
import bdmajora.backport.entity.models.ModelDrowned;
import net.minecraft.client.render.entity.LivingRenderer;

public class DrownedRenderer extends LivingRenderer<EntityDrowned> {
	public DrownedRenderer(ModelDrowned orCreateEntityModel, float v) {
		super(orCreateEntityModel, v);
	}
}
