package bdmajora.backport.block.client;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.util.helper.MathHelper;

public class BellModel extends ModelBase {
	public Cube bell = new Cube(0, 0);
	public Cube fixture = new Cube(16, 0);

	public BellModel() {
		bell.addBox(-3.0F, -6.0F, -3.0F, 6, 7, 6);
		bell.setRotationPoint(8.0F, 12.0F, 8.0F);
		fixture.addBox(4.0F, 4.0F, 4.0F, 8, 2, 8);
		fixture.setRotationPoint(-8.0F, -12.0F, -8.0F);
	}

	public void render(float rotateAngleX, float rotateAngleZ, float scale) {
		bell.rotateAngleX = rotateAngleX;
		bell.rotateAngleZ = rotateAngleZ;
		bell.render(scale);
		fixture.render(scale);
	}

	public void renderBell(float rotateAngleX, float rotateAngleZ) {
		bell.rotateAngleX = rotateAngleX;
		bell.rotateAngleZ = rotateAngleZ;
		bell.render(0.0625f);
	}
}
