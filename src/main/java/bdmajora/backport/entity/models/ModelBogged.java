package bdmajora.backport.entity.models;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelSkeleton;

public class ModelBogged extends ModelSkeleton {

	public Cube[] mushrooms = new Cube[6];

	public ModelBogged() {
		// Initialize skeleton parts from ModelSkeleton
		super();

		// Mushrooms initialization (not rendered, but available)
		this.mushrooms[0] = new Cube(50, 16, 64, 32);
		this.mushrooms[0].addBox(-3.0F, -3.5F, 0.0F, 6, 4, 0);
		this.mushrooms[0].setRotationPoint(3.0F, -7.5F, 3.0F);
		this.mushrooms[0].rotateAngleY = 0.7854F;

		this.mushrooms[1] = new Cube(50, 16, 64, 32);
		this.mushrooms[1].addBox(-3.0F, -3.5F, 0.0F, 6, 4, 0);
		this.mushrooms[1].setRotationPoint(3.0F, -7.5F, 3.0F);
		this.mushrooms[1].rotateAngleY = -0.7854F;

		this.mushrooms[2] = new Cube(50, 27, 64, 32);
		this.mushrooms[2].addBox(-3.0F, -5.0F, 0.0F, 6, 5, 0);
		this.mushrooms[2].setRotationPoint(-3.0F, -6.0F, 6.0F);
		this.mushrooms[2].rotateAngleZ = 0.7854F;

		this.mushrooms[3] = new Cube(50, 27, 64, 32);
		this.mushrooms[3].addBox(-3.0F, -5.0F, 0.0F, 6, 5, 0);
		this.mushrooms[3].setRotationPoint(3.0F, -6.0F, 6.0F);
		this.mushrooms[3].rotateAngleZ = -0.7854F;

		this.mushrooms[4] = new Cube(50, 22, 64, 32);
		this.mushrooms[4].addBox(-3.0F, -2.5F, 0.0F, 6, 4, 0);
		this.mushrooms[4].setRotationPoint(-3.0F, -10.0F, -3.0F);
		this.mushrooms[4].rotateAngleY = 0.7854F;
		this.mushrooms[4].rotateAngleZ = (float) Math.PI;

		this.mushrooms[5] = new Cube(50, 22, 64, 32);
		this.mushrooms[5].addBox(-3.0F, -2.5F, 0.0F, 6, 4, 0);
		this.mushrooms[5].setRotationPoint(-3.0F, -10.0F, -3.0F);
		this.mushrooms[5].rotateAngleY = -0.7854F;
		this.mushrooms[5].rotateAngleZ = (float) Math.PI;
	}

	@Override
	public void render(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		// Render the skeleton parts from the superclass
		super.render(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);

		// Render additional parts like mushrooms (if needed)
		for (Cube mushroom : mushrooms) {
			mushroom.render(scale);  // This line can be commented out if mushrooms aren't needed.
		}
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		super.setRotationAngles(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);
	}
}
