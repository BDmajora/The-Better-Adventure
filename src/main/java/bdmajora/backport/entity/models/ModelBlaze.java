package bdmajora.backport.entity.models;

import net.minecraft.client.render.model.Cube;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.util.helper.MathHelper;

public class ModelBlaze extends ModelBase {

	public Cube upperBodyParts0;
	public Cube upperBodyParts1;
	public Cube upperBodyParts2;
	public Cube upperBodyParts3;
	public Cube upperBodyParts4;
	public Cube upperBodyParts5;
	public Cube upperBodyParts6;
	public Cube upperBodyParts7;
	public Cube upperBodyParts8;
	public Cube upperBodyParts9;
	public Cube upperBodyParts10;
	public Cube upperBodyParts11;
	public Cube head;

	public ModelBlaze() {
		this.upperBodyParts0 = new Cube(0, 16);
		this.upperBodyParts0.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts0.setRotationPoint(8.0F, -2.0F, -3.0F);

		this.upperBodyParts1 = new Cube(0, 16);
		this.upperBodyParts1.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts1.setRotationPoint(-10.0F, -2.0F, 1.0F);

		this.upperBodyParts2 = new Cube(0, 16);
		this.upperBodyParts2.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts2.setRotationPoint(1.0F, -2.0F, 8.0F);

		this.upperBodyParts3 = new Cube(0, 16);
		this.upperBodyParts3.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts3.setRotationPoint(-3.0F, -2.0F, -10.0F);

		this.upperBodyParts4 = new Cube(0, 16);
		this.upperBodyParts4.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts4.setRotationPoint(5.0F, 6.0F, -1.0F);

		this.upperBodyParts5 = new Cube(0, 16);
		this.upperBodyParts5.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts5.setRotationPoint(-7.0F, 6.0F, -1.0F);

		this.upperBodyParts6 = new Cube(0, 16);
		this.upperBodyParts6.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts6.setRotationPoint(-1.0F, 6.0F, 5.0F);

		this.upperBodyParts7 = new Cube(0, 16);
		this.upperBodyParts7.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts7.setRotationPoint(-1.0F, 6.0F, -7.0F);

		this.upperBodyParts8 = new Cube(0, 16);
		this.upperBodyParts8.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts8.setRotationPoint(3.0F, 16.0F, 2.0F);

		this.upperBodyParts9 = new Cube(0, 16);
		this.upperBodyParts9.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts9.setRotationPoint(-5.0F, 16.0F, -4.0F);

		this.upperBodyParts10 = new Cube(0, 16);
		this.upperBodyParts10.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts10.setRotationPoint(-4.0F, 16.0F, 3.0F);

		this.upperBodyParts11 = new Cube(0, 16);
		this.upperBodyParts11.addBox(0, 0, 0, 2, 8, 2);
		this.upperBodyParts11.setRotationPoint(2.0F, 16.0F, -5.0F);

		this.head = new Cube(0, 0);
		this.head.addBox(-4, -4, -4, 8, 8, 8);
		this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
	}

	@Override
	public void render(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbYaw, limbPitch, headYaw, headPitch, scale);
		this.upperBodyParts0.render(scale);
		this.upperBodyParts1.render(scale);
		this.upperBodyParts2.render(scale);
		this.upperBodyParts3.render(scale);
		this.upperBodyParts4.render(scale);
		this.upperBodyParts5.render(scale);
		this.upperBodyParts6.render(scale);
		this.upperBodyParts7.render(scale);
		this.upperBodyParts8.render(scale);
		this.upperBodyParts9.render(scale);
		this.upperBodyParts10.render(scale);
		this.upperBodyParts11.render(scale);
		this.head.render(scale);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbYaw, float limbPitch, float headYaw, float headPitch, float scale) {
		// The blaze doesn't really have animated body parts like legs, but you can rotate the parts slightly for an idle effect
		float rotation = MathHelper.cos(limbSwing * 0.3F) * 0.1F;

		this.upperBodyParts0.rotateAngleY = rotation;
		this.upperBodyParts1.rotateAngleY = -rotation;
		this.upperBodyParts2.rotateAngleY = rotation;
		this.upperBodyParts3.rotateAngleY = -rotation;
		this.upperBodyParts4.rotateAngleY = rotation;
		this.upperBodyParts5.rotateAngleY = -rotation;
		this.upperBodyParts6.rotateAngleY = rotation;
		this.upperBodyParts7.rotateAngleY = -rotation;
		this.upperBodyParts8.rotateAngleY = rotation;
		this.upperBodyParts9.rotateAngleY = -rotation;
		this.upperBodyParts10.rotateAngleY = rotation;
		this.upperBodyParts11.rotateAngleY = -rotation;

		this.head.rotateAngleX = headPitch / 57.29578F;
		this.head.rotateAngleY = headYaw / 57.29578F;
	}
}
