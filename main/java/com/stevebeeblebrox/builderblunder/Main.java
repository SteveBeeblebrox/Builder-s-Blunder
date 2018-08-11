package com.stevebeeblebrox.builderblunder;

import com.stevebeeblebrox.builderblunder.potion.PotionBlunder;
import com.stevebeeblebrox.builderblunder.proxy.CommonProxy;
import com.stevebeeblebrox.builderblunder.util.Reference;

import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod(modid = Reference.MOD_ID, name =  Reference.NAME, version = Reference.VERSION)
public class Main
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final Potion BLUNDER_POTION = new PotionBlunder();
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		ForgeRegistries.POTIONS.register(BLUNDER_POTION);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
}
