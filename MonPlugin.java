package fr.xatoxx.MonPremierPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public class MonPlugin extends JavaPlugin{
	
	@Override
	public void onEnable() {
		System.out.println("Mon super plugin > vien de s'allumer !");
	}

	@Override
	public void onDisable() {
		System.out.println("Mon super plugin > vien de s'éteindre !");
	}
	
}
