package bdmajora.backport.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.render.FontRenderer;
import org.lwjgl.opengl.GL11;

public class GuiClickableLabel extends GuiButton {
	int textColor;
	int bgColor;
	public boolean shadow;

	public GuiClickableLabel(int id, int xPosition, int yPosition, String s, int textColor, int bgColor) {
		super(id, xPosition, yPosition, s);
		this.shadow = true;
		this.textColor = textColor;
		this.bgColor = bgColor;
		this.height = 12;
		this.width = 0;
	}

	public GuiClickableLabel(int id, int xPosition, int yPosition, String s, int textColor) {
		this(id, xPosition, yPosition, s, textColor, 2130706432);
	}

	public void drawButton(Minecraft mc, int mouseX, int mouseY) {
		if (this.visible) {
			FontRenderer fontrenderer = mc.fontRenderer;
			GL11.glBindTexture(3553, mc.renderEngine.getTexture("/gui/gui.png"));
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			boolean hovered = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
			this.width = fontrenderer.getStringWidth(this.displayString) + 4;
			this.drawRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + this.height, this.enabled ? (hovered ? 2139128000 : this.bgColor) : 0);
			if (this.enabled && (this.shadow || hovered)) {
				fontrenderer.drawStringWithShadow(this.displayString, this.xPosition + 2, this.yPosition + 2, hovered ? 16777120 : this.textColor);
			} else {
				fontrenderer.drawString(this.displayString, this.xPosition + 2, this.yPosition + 2, 8355711);
			}

			this.mouseDragged(mc, mouseX, mouseY);
		}
	}
}

