package com.stevebeeblebrox.builderblunder.potion;

import com.stevebeeblebrox.builderblunder.util.Reference;

import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionBlunder extends Potion
{

	public PotionBlunder()
	{
		super(false, 8661504);
		setPotionName("effect.blunder");
		setIconIndex(2, 0);
		setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + "blunder"));
	}
	
}
