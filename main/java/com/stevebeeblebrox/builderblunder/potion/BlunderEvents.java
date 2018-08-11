package com.stevebeeblebrox.builderblunder.potion;

import com.stevebeeblebrox.builderblunder.Main;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class BlunderEvents
{
	@SubscribeEvent
	public static void onBlunder(TickEvent.PlayerTickEvent event)
	{
		boolean blunder = false;
		if(event.player.isPotionActive(Main.BLUNDER_POTION))
			blunder = true;
		if(blunder || event.player.isCreative() || event.player.isSpectator()) {
			event.player.capabilities.allowEdit = false;
		}
		else {
			blunder = false;
			event.player.capabilities.allowEdit = true;
			}
	}
}
