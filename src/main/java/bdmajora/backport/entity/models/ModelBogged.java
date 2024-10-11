package bdmajora.backport.entity.models;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelSkeleton;

public class ModelBogged extends ModelSkeleton {

	public Cube[] mushrooms = new Cube[6];

	public ModelBogged() {
		// Initialize skeleton parts from ModelSkeleton
		super();

		// Mushrooms attached to the head (0-1, bottom right)
		this.mushrooms[0] = new Cube(50, 16, 64, 32);
		this.mushrooms[0].addBox(-3.0F, -3.5F, 0.0F, 6, 4, 0);
		this.mushrooms[0].setRotationPoint(3.0F, -7.5F, 3.0F); // Bottom right corner of the head

		this.mushrooms[1] = new Cube(50, 16, 64, 32);
		this.mushrooms[1].addBox(-3.0F, -3.5F, 0.0F, 6, 4, 0);
		this.mushrooms[1].setRotationPoint(3.0F, -7.5F, 3.0F); // Same bottom right corner of the head

		// Mushrooms 2 and 3 moved diagonally to the opposite side of the head

		// Mushroom 2: Move to the top left corner of the head (opposite side)
		this.mushrooms[2] = new Cube(50, 27, 64, 32);
		this.mushrooms[2].addBox(-3.0F, -5.0F, 0.0F, 6, 5, 0);
		this.mushrooms[2].setRotationPoint(-3.0F, -7.5F, -3.0F); // Top left of the head
		this.mushrooms[2].rotateAngleY = 0.7854F; // Adjust rotation for the X shape

		// Mushroom 3: Positioned diagonally across from mushroom 2
		this.mushrooms[3] = new Cube(50, 27, 64, 32);
		this.mushrooms[3].addBox(-3.0F, -5.0F, 0.0F, 6, 5, 0);
		this.mushrooms[3].setRotationPoint(-3.0F, -7.5F, -3.0F); // Same position as mushroom 2
		this.mushrooms[3].rotateAngleY = -0.7854F; // Opposite rotation to create the X shape

		// Mushrooms attached to the back (4-5)
		this.mushrooms[4] = new Cube(50, 22, 64, 32);
		this.mushrooms[4].addBox(-3.0F, -2.5F, 0.0F, 6, 4, 0);
		this.mushrooms[4].setRotationPoint(-5.0F, 6.0F, -3.0F); // Back of the head

		this.mushrooms[5] = new Cube(50, 22, 64, 32);
		this.mushrooms[5].addBox(-3.0F, -2.5F, 0.0F, 6, 4, 0);
		this.mushrooms[5].setRotationPoint(5.0F, 6.0F, -3.0F); // Back of the head, mirrored
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
