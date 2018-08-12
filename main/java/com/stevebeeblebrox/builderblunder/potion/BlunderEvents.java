package com.stevebeeblebrox.builderblunder.potion;

import com.stevebeeblebrox.builderblunder.Main;
import com.stevebeeblebrox.builderblunder.util.Reference;

import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class BlunderEvents
{
	@SubscribeEvent
	public static void onplace(BlockEvent.PlaceEvent event)
		{
		if(event.getPlayer().isPotionActive(Main.BLUNDER_POTION) && !event.getPlayer().isCreative())
			event.setCanceled(true);
		}
	}
