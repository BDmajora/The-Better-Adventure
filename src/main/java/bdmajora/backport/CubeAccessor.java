package bdmajora.backport;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.render.model.Cube;

public class CubeAccessor extends Cube {

	public CubeAccessor(int u, int v, int texWidth, int texHeight) {
		super(u, v, texWidth, texHeight);
	}

	/**
	 * Translates and rotates the cube using its position and rotation angles.
	 * This method handles any transformations before rendering the cube.
	 *
	 * @param scale The scale to apply to the cube's transformation.
	 */
	public void translateTo(float scale) {
		if (!this.field_1402_i) {
			if (this.showModel) {
				if (!isCompiled()) {  // Use reflection to get the value of the 'compiled' field
					invokeCompileDisplayList(scale);  // Use reflection to invoke compileDisplayList
					setCompiled(true);  // Set the 'compiled' field to true
				}

				// If there are no rotation angles, only apply translations
				if (this.rotateAngleX == 0.0F && this.rotateAngleY == 0.0F && this.rotateAngleZ == 0.0F) {
					if (this.rotationPointX != 0.0F || this.rotationPointY != 0.0F || this.rotationPointZ != 0.0F) {
						GL11.glTranslatef(this.rotationPointX * scale, this.rotationPointY * scale, this.rotationPointZ * scale);
					}
				} else {
					// Apply both translation and rotation
					GL11.glTranslatef(this.rotationPointX * scale, this.rotationPointY * scale, this.rotationPointZ * scale);

					if (this.rotateAngleZ != 0.0F) {
						GL11.glRotatef(this.rotateAngleZ * 57.29578F, 0.0F, 0.0F, 1.0F);
					}

					if (this.rotateAngleY != 0.0F) {
						GL11.glRotatef(this.rotateAngleY * 57.29578F, 0.0F, 1.0F, 0.0F);
					}

					if (this.rotateAngleX != 0.0F) {
						GL11.glRotatef(this.rotateAngleX * 57.29578F, 1.0F, 0.0F, 0.0F);
					}
				}
			}
		}
	}

	/**
	 * Uses reflection to access and invoke the private compileDisplayList(float) method
	 * in the Cube class.
	 *
	 * @param scale The scale to pass to the compileDisplayList method.
	 */
	private void invokeCompileDisplayList(float scale) {
		try {
			// Get the compileDisplayList method from the Cube class
			Method compileMethod = Cube.class.getDeclaredMethod("compileDisplayList", float.class);
			compileMethod.setAccessible(true);  // Bypass private access
			compileMethod.invoke(this, scale);  // Invoke the method on this instance of CubeAccessor
		} catch (Exception e) {
			e.printStackTrace();  // Handle any exceptions during reflection
		}
	}

	/**
	 * Uses reflection to check if the compiled field is true or false.
	 *
	 * @return The value of the compiled field.
	 */
	private boolean isCompiled() {
		try {
			// Access the private 'compiled' field from the Cube class
			Field compiledField = Cube.class.getDeclaredField("compiled");
			compiledField.setAccessible(true);  // Bypass private access
			return compiledField.getBoolean(this);  // Get the value of the 'compiled' field for this instance
		} catch (Exception e) {
			e.printStackTrace();  // Handle any exceptions during reflection
			return false;
		}
	}

	/**
	 * Uses reflection to set the value of the compiled field.
	 *
	 * @param value The value to set the compiled field to.
	 */
	private void setCompiled(boolean value) {
		try {
			// Access the private 'compiled' field from the Cube class
			Field compiledField = Cube.class.getDeclaredField("compiled");
			compiledField.setAccessible(true);  // Bypass private access
			compiledField.setBoolean(this, value);  // Set the value of the 'compiled' field for this instance
		} catch (Exception e) {
			e.printStackTrace();  // Handle any exceptions during reflection
		}
	}
}
