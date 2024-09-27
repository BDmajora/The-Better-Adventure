package bdmajora.backport.entity.models;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.util.helper.MathHelper;

public class ModelPolarBear extends ModelBase {

	public Cube head;
	public Cube nose;
	public Cube leftEar;
	public Cube rightEar;
	public Cube smallBodyPiece;
	public Cube largeBodyPiece;
	public Cube rightFrontLeg;
	public Cube leftFrontLeg;
	public Cube rightHindLeg;
	public Cube leftHindLeg;

	public ModelPolarBear() {
		// Small body piece - new texture coordinates
		this.smallBodyPiece = new Cube(39, 0, 128, 64); // Starting at (39, 0) with a texture of 128x64
		this.smallBodyPiece.addBox(-6.0F, -6.0F, -5.0F, 12, 12, 10); // Adjust the size of the box if needed
		this.smallBodyPiece.setRotationPoint(0.0F, 9.0F, -6.0F);
		this.smallBodyPiece.rotateAngleX = (float) Math.toRadians(90.0F);

		// Large body piece with updated texture coordinates
		this.largeBodyPiece = new Cube(0, 19, 128, 64); // Starts at (0, 19) on a 128x64 texture
		this.largeBodyPiece.addBox(-7.0F, -7.0F, -5.5F, 14, 14, 11); // Physical dimensions of the large body piece
		this.largeBodyPiece.setRotationPoint(0.0F, 9.0F, 6.5F);
		this.largeBodyPiece.rotateAngleX = (float) Math.toRadians(90.0F);

		// Head with updated texture coordinates
		this.head = new Cube(0, 0, 128, 64); // Starts at (0, 0) on a 128x64 texture
		this.head.addBox(-3.5F, -3.5F, -4.0F, 7, 7, 8); // Physical dimensions of the head
		this.head.setRotationPoint(0.0F, 9.0F, -15.0F);
		this.head.rotateAngleX = -0.2618F; // -15 degrees

		// Nose with updated texture coordinates
		this.nose = new Cube(0, 44, 128, 64);
		this.nose.addBox(-2.5F, -1.5F, -5.5F, 5, 3, 3);
		this.nose.setRotationPoint(0.0F, 10.0F, -16.0F);

		// Ears with updated texture coordinates, will move like tendrils
		this.leftEar = new Cube(26, 0, 128, 64);
		this.leftEar.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 1);
		this.leftEar.setRotationPoint(2.5F, 5.0F, -15.0F);  // Adjusted Z to move with head

		this.rightEar = new Cube(26, 0, 128, 64);
		this.rightEar.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 1);
		this.rightEar.setRotationPoint(-2.5F, 5.0F, -15.0F); // Adjusted Z to move with head

		// Legs with updated texture coordinates
		this.rightFrontLeg = new Cube(50, 22, 128, 64);
		this.rightFrontLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 8);
		this.rightFrontLeg.setRotationPoint(-4.5F, 14.0F, 6.0F);

		this.leftFrontLeg = new Cube(50, 22, 128, 64);
		this.leftFrontLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 8);
		this.leftFrontLeg.setRotationPoint(4.5F, 14.0F, 6.0F);

		this.rightHindLeg = new Cube(50, 40, 128, 64);
		this.rightHindLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 6);
		this.rightHindLeg.setRotationPoint(-3.5F, 14.0F, -8.0F);

		this.leftHindLeg = new Cube(50, 40, 128, 64);
		this.leftHindLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 6);
		this.leftHindLeg.setRotationPoint(3.5F, 14.0F, -8.0F);
	}

	@Override
	public void render(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);

		// Render body parts
		this.smallBodyPiece.render(scale);
		this.largeBodyPiece.render(scale);

		// Render other parts
		this.head.render(scale);
		this.nose.render(scale);
		this.leftEar.render(scale);
		this.rightEar.render(scale);
		this.rightFrontLeg.render(scale);
		this.leftFrontLeg.render(scale);
		this.rightHindLeg.render(scale);
		this.leftHindLeg.render(scale);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		// Head rotation
		this.head.rotateAngleX = headPitch / 57.29578F;
		this.head.rotateAngleY = headYaw / 57.29578F;

		// Nose moves with the head
		this.nose.rotateAngleX = this.head.rotateAngleX;
		this.nose.rotateAngleY = this.head.rotateAngleY;

		// Ears move like tendrils
		this.leftEar.rotateAngleX = this.head.rotateAngleX;
		this.leftEar.rotateAngleY = this.head.rotateAngleY;
		this.rightEar.rotateAngleX = this.head.rotateAngleX;
		this.rightEar.rotateAngleY = this.head.rotateAngleY;

		// Legs movement
		float legSwingAmplitude = (float) Math.toRadians(10);
		float legSwingSpeed = limbSwing * 0.6662F;

		this.rightFrontLeg.rotateAngleX = MathHelper.cos(legSwingSpeed) * legSwingAmplitude;
		this.leftFrontLeg.rotateAngleX = MathHelper.cos(legSwingSpeed + (float) Math.PI) * legSwingAmplitude;
		this.rightHindLeg.rotateAngleX = MathHelper.cos(legSwingSpeed + (float) Math.PI) * legSwingAmplitude;
		this.leftHindLeg.rotateAngleX = MathHelper.cos(legSwingSpeed) * legSwingAmplitude;
	}
}
