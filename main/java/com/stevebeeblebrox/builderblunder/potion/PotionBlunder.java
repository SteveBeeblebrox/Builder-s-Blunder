package com.stevebeeblebrox.builderblunder.potion;

import com.stevebeeblebrox.builderblunder.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionBlunder extends Potion
{

	public PotionBlunder()
	{
		super(false, 8661504);
		setPotionName("effect.blunder");
		setIconIndex(0, 0); //2,0
		setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + "blunder"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("assets/blunder/textures/blunder.png"));
		return true;
	} 
}
