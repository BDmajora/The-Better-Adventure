package bdmajora.backport.entity.models;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelSkeleton;

public class ModelBogged extends ModelSkeleton {

	public Cube[] mushrooms = new Cube[6];

	public ModelBogged() {
		// Initialize skeleton parts from ModelSkeleton
		super();

		// Mushrooms attached to the head (0-1, bottom right), forming X shape
		this.mushrooms[0] = new Cube(50, 16, 64, 32);
		this.mushrooms[0].addBox(-3.0F, -3.5F, 0.0F, 6, 4, 0);
		this.mushrooms[0].setRotationPoint(3.0F, -7.5F, 3.0F);
		this.mushrooms[0].rotateAngleY = 0.7854F;

		this.mushrooms[1] = new Cube(50, 16, 64, 32);
		this.mushrooms[1].addBox(-3.0F, -3.5F, 0.0F, 6, 4, 0);
		this.mushrooms[1].setRotationPoint(3.0F, -7.5F, 3.0F);
		this.mushrooms[1].rotateAngleY = -0.7854F;

		// Mushrooms 2 and 3 forming an X shape, now on the back of the head
		this.mushrooms[2] = new Cube(50, 27, 64, 32);
		this.mushrooms[2].addBox(-3.0F, -5.0F, 0.0F, 6, 5, 0);
		this.mushrooms[2].setRotationPoint(-3.0F, -6.0F, 6.0F); // Moved farther back
		this.mushrooms[2].rotateAngleZ = 0.7854F; // X shape, rotated along the Z-axis

		this.mushrooms[3] = new Cube(50, 27, 64, 32);
		this.mushrooms[3].addBox(-3.0F, -5.0F, 0.0F, 6, 5, 0);
		this.mushrooms[3].setRotationPoint(3.0F, -6.0F, 6.0F); // Lowered and behind the head, mirrored
		this.mushrooms[3].rotateAngleZ = -0.7854F; // X shape, rotated along the Z-axis

		// Mushrooms 4 and 5 (unchanged)
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
		// Call render for skeleton body parts
		super.render(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);

		// Render mushrooms
		for (Cube mushroom : mushrooms) {
			mushroom.render(scale);
		}
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		super.setRotationAngles(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);
	}
}
