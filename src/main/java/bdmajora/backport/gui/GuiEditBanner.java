package bdmajora.backport.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiContainer;
import net.minecraft.client.gui.GuiSurface;
import net.minecraft.client.gui.GuiTexturedButton;
import net.minecraft.client.gui.drawing.DrawableEditor;
import net.minecraft.client.gui.drawing.IDrawableSurface;
import net.minecraft.client.util.helper.Colors;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.lang.I18n;
import net.minecraft.core.net.command.TextFormatting;
import net.minecraft.core.net.packet.Packet250CustomPayload;
import net.minecraft.core.util.helper.MathHelper;
import org.lwjgl.opengl.GL11;
import bdmajora.backport.block.entity.TileEntityBanner;
import bdmajora.backport.block.container.ContainerBanner;
import bdmajora.backport.gui.GuiClickableLabel;

public class GuiEditBanner extends GuiContainer implements IDrawableSurface<Byte> {
	private final TileEntityBanner tileEntity;
	private final int CANVAS_SCALE = 4;
	private final int CANVAS_WIDTH = 24;
	private final int CANVAS_HEIGHT = 16;
	private int xLast = 0;
	private int yLast = 0;
	private int mouseButton;
	private boolean isDrawing = false;
	private int canvasX = 0;
	private int canvasY = 0;
	private int selectedColor = 0;
	private GuiClickableLabel[] colorLabels;
	private final DrawableEditor<Byte> BannerSurfaceEditor;
	private final DrawableEditor<Byte> drawOverlaySurfaceEditor;
	private GuiTexturedButton[] toolBtns;
	private int activeTool = 0;
	GuiSurface BannerSurface;
	GuiSurface drawOverlaySurface;

	public GuiEditBanner(EntityPlayer player, TileEntityBanner BannerTileEntity) {
		super(new ContainerBanner(player.inventory, BannerTileEntity));
		this.tileEntity = BannerTileEntity;
		this.xSize = 176;
		this.ySize = 195;
		BannerTileEntity.owner = player.username;
		this.BannerSurface = new GuiSurface(24, 16, 4, BannerTileEntity.BannerColors);
		this.BannerSurfaceEditor = new DrawableEditor(this.BannerSurface);
		this.drawOverlaySurface = new GuiSurface(24, 16, 4);
		this.drawOverlaySurfaceEditor = new DrawableEditor(this.drawOverlaySurface);
	}

	public void init() {
		super.init();
		this.controlList.clear();
		this.canvasX = (this.width - this.xSize) / 2 + 27;
		this.canvasY = (this.height - this.ySize) / 2 + 8;
		this.toolBtns = new GuiTexturedButton[7];

		int i;
		for(i = 0; i < 7; ++i) {
			this.toolBtns[i] = new GuiTexturedButton(i, "/gui/banner_editor.png", (this.width - this.xSize) / 2 + 12 + 22 * i, (this.height - this.ySize) / 2 + 76, 20 * i, 195, 20, 20);
			if (i == this.activeTool) {
				this.toolBtns[i].enabled = false;
			}

			this.controlList.add(this.toolBtns[i]);
		}

		this.colorLabels = new GuiClickableLabel[3];

		for(i = 0; i < 3; ++i) {
			this.colorLabels[i] = new GuiClickableLabel(100 + i, (this.width - this.xSize) / 2 + 150, (this.height - this.ySize) / 2 + 12 + i * 22, String.valueOf(i + 1), -1, 0);
			if (i != this.selectedColor) {
				this.colorLabels[i].textColor = -12632257;
				this.colorLabels[i].shadow = false;
			}

			this.controlList.add(this.colorLabels[i]);
		}

	}

	private void renderCanvas() {
		this.canvasX = (this.width - this.xSize) / 2 + 27;
		this.canvasY = (this.height - this.ySize) / 2 + 8;
		int[] colors = new int[5];

		for(int i = 1; i < 4; ++i) {
			ItemStack stack = this.tileEntity.getStackInSlot(35 + i);
			if (stack != null && stack.getItem() == Item.dye) {
				colors[i] = Colors.allFlagColors[TextFormatting.get(15 - stack.getMetadata()).id].getARGB();
			}
		}

		colors[4] = -1;
		this.BannerSurface.colors = colors;
		this.drawOverlaySurface.colors = colors;
		GL11.glEnable(3042);
		GL11.glBlendFunc(769, 768);
		this.BannerSurface.render(this.canvasX, this.canvasY);
		GL11.glDisable(3042);
		this.drawOverlaySurface.render(this.canvasX, this.canvasY);
	}

	public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
		super.mouseClicked(mouseX, mouseY, mouseButton);
		if (this.tileEntity.getStackInSlot(36 + this.selectedColor) != null) {
			int xInCanvas;
			int yInCanvas;
			byte color;
			if (this.activeTool >= 0 && this.activeTool < 3) {
				if (!this.isDrawing) {
					xInCanvas = (mouseX - this.canvasX) / 4;
					yInCanvas = (mouseY - this.canvasY) / 4;
					if (xInCanvas >= 0 && xInCanvas < 24 && yInCanvas >= 0 && yInCanvas < 16) {
						this.isDrawing = true;
						this.xLast = xInCanvas;
						this.yLast = yInCanvas;
						this.mouseButton = mouseButton;
						color = 0;
						if (this.mouseButton == 0) {
							color = (byte)(this.selectedColor + 1);
						}

						this.BannerSurfaceEditor.drawLine(xInCanvas, yInCanvas, xInCanvas, yInCanvas, color, this.activeTool + 1);
					}
				}
			} else if (this.activeTool == 3) {
				if (!this.isDrawing) {
					xInCanvas = (mouseX - this.canvasX) / 4;
					yInCanvas = (mouseY - this.canvasY) / 4;
					if (xInCanvas >= 0 && xInCanvas < 24 && yInCanvas >= 0 && yInCanvas < 16) {
						this.isDrawing = true;
						this.mouseButton = mouseButton;
						color = 0;
						if (this.mouseButton == 0) {
							color = (byte)(this.selectedColor + 1);
						}

						this.BannerSurfaceEditor.floodFill(xInCanvas, yInCanvas, color);
					}
				}
			} else if ((this.activeTool == 4 || this.activeTool == 5 || this.activeTool == 6) && !this.isDrawing) {
				xInCanvas = (mouseX - this.canvasX) / 4;
				yInCanvas = (mouseY - this.canvasY) / 4;
				if (xInCanvas >= 0 && xInCanvas < 24 && yInCanvas >= 0 && yInCanvas < 16) {
					this.isDrawing = true;
					this.mouseButton = mouseButton;
					this.xLast = xInCanvas;
					this.yLast = yInCanvas;
				}
			}

		}
	}

	protected void buttonPressed(GuiButton button) {
		super.buttonPressed(button);
		if (button.id >= 0 && button.id < 7) {
			this.toolBtns[this.activeTool].enabled = true;
			this.activeTool = button.id;
			button.enabled = false;
		}

		if (button.id >= 100 && button.id < 103) {
			this.colorLabels[this.selectedColor].textColor = -12566464;
			this.colorLabels[this.selectedColor].shadow = false;
			this.selectedColor = button.id - 100;
			this.colorLabels[this.selectedColor].textColor = -1;
			this.colorLabels[this.selectedColor].shadow = true;
		}

	}

	public void mouseMovedOrButtonReleased(int mouseX, int mouseY, int mouseButton) {
		super.mouseMovedOrButtonReleased(mouseX, mouseY, mouseButton);
		int xInCanvas;
		int yInCanvas;
		byte color;
		if (this.activeTool >= 0 && this.activeTool < 3) {
			if (this.isDrawing && mouseButton != -1) {
				this.isDrawing = false;
				this.mouseButton = -1;
			} else if (this.isDrawing) {
				xInCanvas = (mouseX - this.canvasX) / 4;
				yInCanvas = (mouseY - this.canvasY) / 4;
				color = 0;
				if (this.mouseButton == 0) {
					color = (byte)(this.selectedColor + 1);
				}

				if (MathHelper.abs((float)(this.xLast - xInCanvas)) <= 1.0F && MathHelper.abs((float)(this.yLast - yInCanvas)) <= 1.0F) {
					this.BannerSurfaceEditor.drawLine(xInCanvas, yInCanvas, xInCanvas, yInCanvas, color, this.activeTool + 1);
				} else {
					this.BannerSurfaceEditor.drawLine(this.xLast, this.yLast, xInCanvas, yInCanvas, color, this.activeTool + 1);
				}

				this.xLast = xInCanvas;
				this.yLast = yInCanvas;
			}
		} else if (this.activeTool == 3) {
			if (this.isDrawing && mouseButton != -1) {
				this.isDrawing = false;
				this.mouseButton = -1;
			}
		} else if (this.activeTool == 4) {
			if (this.isDrawing && mouseButton != -1) {
				this.isDrawing = false;
				xInCanvas = (mouseX - this.canvasX) / 4;
				yInCanvas = (mouseY - this.canvasY) / 4;
				color = 0;
				if (this.mouseButton == 0) {
					color = (byte)(this.selectedColor + 1);
				}

				this.BannerSurfaceEditor.drawRectangle(this.xLast, this.yLast, xInCanvas, yInCanvas, color);
				this.mouseButton = -1;
			}
		} else if (this.activeTool == 5) {
			if (this.isDrawing && mouseButton != -1) {
				this.isDrawing = false;
				xInCanvas = (mouseX - this.canvasX) / 4;
				yInCanvas = (mouseY - this.canvasY) / 4;
				color = 0;
				if (this.mouseButton == 0) {
					color = (byte)(this.selectedColor + 1);
				}

				this.BannerSurfaceEditor.drawEllipse(this.xLast, this.yLast, xInCanvas, yInCanvas, color);
				this.mouseButton = -1;
			}
		} else if (this.activeTool == 6 && this.isDrawing && mouseButton != -1) {
			this.isDrawing = false;
			xInCanvas = (mouseX - this.canvasX) / 4;
			yInCanvas = (mouseY - this.canvasY) / 4;
			color = 0;
			if (this.mouseButton == 0) {
				color = (byte)(this.selectedColor + 1);
			}

			this.BannerSurfaceEditor.drawLine(this.xLast, this.yLast, xInCanvas, yInCanvas, color, 1);
			this.mouseButton = -1;
		}

	}

	protected void drawGuiContainerBackgroundLayer(float f) {
		int i = this.mc.renderEngine.getTexture("/gui/banner_editor.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(i);
		int j = (this.width - this.xSize) / 2;
		int k = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(j, k, 0, 0, this.xSize, this.ySize);
		this.drawTexturedModalRect(j + 127, k + 8 + this.selectedColor * 22, 176, 0, 20, 20);
	}

	public void drawScreen(int mouseX, int mouseY, float partialTick) {
		super.drawScreen(mouseX, mouseY, partialTick);
		this.drawOverlaySurface.clear();
		int xInCanvas = (mouseX - this.canvasX) / 4;
		int yInCanvas = (mouseY - this.canvasY) / 4;
		byte color = (byte)(this.selectedColor + 1);
		if (this.mouseButton == 1) {
			color = 4;
		}

		if (this.activeTool >= 0 && this.activeTool < 3) {
			this.drawOverlaySurfaceEditor.drawLine(xInCanvas, yInCanvas, xInCanvas, yInCanvas, color, this.activeTool + 1);
		} else if (this.activeTool == 3) {
			this.drawOverlaySurfaceEditor.drawLine(xInCanvas, yInCanvas, xInCanvas, yInCanvas, color, 1);
		} else if (this.activeTool == 4) {
			if (this.isDrawing) {
				this.drawOverlaySurfaceEditor.drawRectangle(this.xLast, this.yLast, xInCanvas, yInCanvas, color);
			} else {
				this.drawOverlaySurfaceEditor.drawLine(xInCanvas, yInCanvas, xInCanvas, yInCanvas, color, 1);
			}
		} else if (this.activeTool == 5) {
			if (this.isDrawing) {
				this.drawOverlaySurfaceEditor.drawEllipse(this.xLast, this.yLast, xInCanvas, yInCanvas, color);
			} else {
				this.drawOverlaySurfaceEditor.drawLine(xInCanvas, yInCanvas, xInCanvas, yInCanvas, color, 1);
			}
		} else if (this.activeTool == 6) {
			if (this.isDrawing) {
				this.drawOverlaySurfaceEditor.drawLine(this.xLast, this.yLast, xInCanvas, yInCanvas, color, 1);
			} else {
				this.drawOverlaySurfaceEditor.drawLine(xInCanvas, yInCanvas, xInCanvas, yInCanvas, color, 1);
			}
		}

		this.renderCanvas();
	}

	protected void drawGuiContainerForegroundLayer() {
		this.fontRenderer.drawString(I18n.getInstance().translateKey("gui.edit_Banner.label.inventory"), 8, this.ySize - 96 + 2, -12566464);
	}

	public void keyTyped(char c, int keyCode, int mouseX, int mouseY) {
		if (keyCode == 1 || this.mc.gameSettings.keyInventory.isKeyboardKey(keyCode) || keyCode == 14) {
			if (this.mc.theWorld.isClientSide) {
				this.mc.getSendQueue().addToSendQueue(new Packet250CustomPayload("BTA|Banner", this.tileEntity.BannerColors));
			}

			this.mc.thePlayer.closeScreen();
		}

		if (keyCode == 2 || keyCode == 3 || keyCode == 4) {
			this.colorLabels[this.selectedColor].textColor = -12566464;
			this.colorLabels[this.selectedColor].shadow = false;
			this.selectedColor = keyCode - 2;
			this.colorLabels[this.selectedColor].textColor = -1;
			this.colorLabels[this.selectedColor].shadow = true;
		}

		super.keyTyped(c, keyCode, mouseX, mouseY);
	}

	public int getWidth() {
		return 24;
	}

	public int getHeight() {
		return 16;
	}

	public Byte getPixelValue(int x, int y) {
		if (x >= 0 && x < 24) {
			return y >= 0 && y < 16 ? this.tileEntity.BannerColors[x + 24 * y] : 0;
		} else {
			return 0;
		}
	}

	public boolean setPixelValue(int x, int y, Byte value) {
		if (x >= 0 && x < 24) {
			if (y >= 0 && y < 16) {
				this.tileEntity.BannerColors[x + 24 * y] = value;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
