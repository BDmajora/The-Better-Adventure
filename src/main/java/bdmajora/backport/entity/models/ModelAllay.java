package bdmajora.backport.entity.models;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.util.helper.MathHelper;

public class ModelAllay extends ModelBase {


	public Cube head;
	public Cube body;
	public Cube rightArm;
	public Cube leftArm;
	public Cube leftWing;
	public Cube rightWing;

	public ModelAllay() {

		// Define head with texture dimensions
		this.head = new Cube(0, 0, 32, 32);
		this.head.addBox(-2.5F, -5.01F, -2.5F, 5, 5, 5);
		this.head.setRotationPoint(0.0F, 0.0F, 0.0F);

		// Define body with texture dimensions
		this.body = new Cube(0, 10, 32, 32);
		this.body.addBox(-1.5F, 0.0F, -1.0F, 3, 4, 2);
		this.body.setRotationPoint(0.0F, 0.0F, 0.0F);

		// Define rightArm with texture dimensions
		this.rightArm = new Cube(23, 0, 32, 32);
		this.rightArm.addBox(-0.75F, -0.5F, -1.0F, 1, 4, 2);
		this.rightArm.setRotationPoint(-1.75F, 0.5F, 0.0F);

		// Define leftArm with texture dimensions
		this.leftArm = new Cube(23, 6, 32, 32);
		this.leftArm.addBox(-0.25F, -0.5F, -1.0F, 1, 4, 2);
		this.leftArm.setRotationPoint(1.75F, 0.5F, 0.0F);

		// Define leftWing with texture dimensions
		this.leftWing = new Cube(16, 14, 32, 32);
		this.leftWing.addBox(0.0F, 0.0F, 0.0F, 0, 5, 8);
		this.leftWing.setRotationPoint(0.5F, 1.0F, 1.0F);

		// Define rightWing with texture dimensions
		this.rightWing = new Cube(16, 14, 32, 32);
		this.rightWing.addBox(0.0F, 0.0F, 0.0F, 0, 5, 8);
		this.rightWing.setRotationPoint(-0.5F, 1.0F, 1.0F);
	}

	@Override
	public void render(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);

		this.head.render(scale);
		this.body.render(scale);
		this.rightArm.render(scale);
		this.leftArm.render(scale);
		this.leftWing.render(scale);
		this.rightWing.render(scale);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		// Head rotation
		this.head.rotateAngleX = headPitch / 57.29578F;
		this.head.rotateAngleY = headYaw / 57.29578F;

		// Resting arm angle
		float armRestingAngle = (float) Math.toRadians(15); // 15-degree outward angle for the resting position

		// Arms: slight up and down movement around the resting angle
		float armSwingAmplitude = (float) Math.toRadians(8); // Adjust for slight movement
		float armSwingSpeed = limbSwing * 0.6662F; // Speed of the movement

		// Right arm movement: start from resting position and add slight movement
		this.rightArm.rotateAngleZ = armRestingAngle + MathHelper.cos(armSwingSpeed) * armSwingAmplitude;

		// Left arm movement: mirror of the right arm
		this.leftArm.rotateAngleZ = -armRestingAngle + MathHelper.cos(armSwingSpeed + (float) Math.PI) * armSwingAmplitude;

		// Wings movement (left-right strafe, kept as is)
		float wingAmplitude = 0.5F; // Adjust amplitude for gentler movement
		float wingSpeed = limbSwing * 0.3331F; // Adjust speed for smoother movement

		// Move wings left and right without rotating them vertically
		this.rightWing.rotationPointZ = MathHelper.cos(wingSpeed) * wingAmplitude; // Moves right wing in and out along Z-axis
		this.leftWing.rotationPointZ = -MathHelper.cos(wingSpeed) * wingAmplitude; // Moves left wing in and out along Z-axis
	}


}
