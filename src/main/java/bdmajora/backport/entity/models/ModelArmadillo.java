package bdmajora.backport.entity.models;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.util.helper.MathHelper;

public class ModelArmadillo extends ModelBase {

	public Cube head;
	public Cube body;
	public Cube rightFrontLeg;
	public Cube leftFrontLeg;
	public Cube rightHindLeg;
	public Cube leftHindLeg;
	public Cube tail;
	public Cube bodyRolledUp;

	public ModelArmadillo() {

		// Define body with correct texture dimensions and coordinates
		this.body = new Cube(0, 20, 64, 64);
		this.body.addBox(-4.0F, -7.0F, -10.0F, 8, 8, 12);
		this.body.setRotationPoint(0.0F, 21.0F, 4.0F);

		// Define tail with correct dimensions and rotation
		this.tail = new Cube(44, 53, 64, 64);
		this.tail.addBox(-0.5F, -0.0865F, 0.0933F, 1, 6, 1);
		this.tail.setRotationPoint(0.0F, -3.0F, 1.0F);
		this.tail.rotateAngleX = 0.5061F;

		// Define head with texture and correct dimensions
		this.head = new Cube(43, 15, 64, 64);
		this.head.addBox(-1.5F, -1.0F, -1.0F, 3, 5, 2);
		this.head.setRotationPoint(0.0F, -2.0F, -11.0F);
		this.head.rotateAngleX = -0.3927F;

		// Define rightFrontLeg with correct dimensions and coordinates
		this.rightFrontLeg = new Cube(51, 43, 64, 64);
		this.rightFrontLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2);
		this.rightFrontLeg.setRotationPoint(-2.0F, 21.0F, -4.0F);

		// Define leftFrontLeg with correct dimensions and coordinates
		this.leftFrontLeg = new Cube(42, 43, 64, 64);
		this.leftFrontLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2);
		this.leftFrontLeg.setRotationPoint(2.0F, 21.0F, -4.0F);

		// Define rightHindLeg with correct dimensions and coordinates
		this.rightHindLeg = new Cube(51, 31, 64, 64);
		this.rightHindLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2);
		this.rightHindLeg.setRotationPoint(-2.0F, 21.0F, 4.0F);

		// Define leftHindLeg with correct dimensions and coordinates
		this.leftHindLeg = new Cube(42, 31, 64, 64);
		this.leftHindLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2);
		this.leftHindLeg.setRotationPoint(2.0F, 21.0F, 4.0F);

		// Define bodyRolledUp with correct texture dimensions and coordinates
		this.bodyRolledUp = new Cube(0, 0, 64, 64);
		this.bodyRolledUp.addBox(-5.0F, -10.0F, -6.0F, 10, 10, 10);
		this.bodyRolledUp.setRotationPoint(0.0F, 24.0F, 27.0F);
	}

	@Override
	public void render(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);

		this.head.render(scale);
		this.body.render(scale);
		this.rightFrontLeg.render(scale);
		this.leftFrontLeg.render(scale);
		this.rightHindLeg.render(scale);
		this.leftHindLeg.render(scale);
		this.tail.render(scale);
		this.bodyRolledUp.render(scale);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		// Head rotation
		this.head.rotateAngleX = headPitch / 57.29578F;
		this.head.rotateAngleY = headYaw / 57.29578F;

		// Leg swing parameters
		float legSwingAmplitude = (float) Math.toRadians(15);
		float legSwingSpeed = limbSwing * 0.6662F;

		// Right front leg movement
		this.rightFrontLeg.rotateAngleX = MathHelper.cos(legSwingSpeed) * legSwingAmplitude;
		// Left front leg movement
		this.leftFrontLeg.rotateAngleX = MathHelper.cos(legSwingSpeed + (float) Math.PI) * legSwingAmplitude;

		// Right hind leg movement
		this.rightHindLeg.rotateAngleX = MathHelper.cos(legSwingSpeed + (float) Math.PI) * legSwingAmplitude;
		// Left hind leg movement
		this.leftHindLeg.rotateAngleX = MathHelper.cos(legSwingSpeed) * legSwingAmplitude;

		// Tail wag movement (slight)
		this.tail.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * (float) Math.toRadians(5);
	}
}
