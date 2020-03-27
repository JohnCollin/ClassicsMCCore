package org.classicsmc.classicsmccore;

import org.bukkit.plugin.java.JavaPlugin;
import org.classicsmc.classicsmccore.api.ClassicsMCCoreAPI;
import org.classicsmc.classicsmccore.command.ClassicsCommandFramework;
import org.classicsmc.classicsmccore.command.library.player.ClassicsMessageToggleCommand;
import org.classicsmc.classicsmccore.command.library.testing.ClassicsPingCommand;
import org.classicsmc.classicsmccore.player.ClassicsPlayerManager;

public class ClassicsMCCore extends JavaPlugin {
  
  @Override
  public void onEnable() {
    ClassicsMCCoreAPI.setClassicsMCCorePlugin(this);
  
    setupPlayerManager();
  
    setupCommandFramework();
  }
  
  private void setupPlayerManager() {
    ClassicsPlayerManager classicsPlayerManager;
    classicsPlayerManager = new ClassicsPlayerManager();
    
    ClassicsMCCoreAPI.setClassicsPlayerManager(classicsPlayerManager);
  }
  
  private void setupCommandFramework() {
    ClassicsCommandFramework classicsCommandFramework;
    classicsCommandFramework = new ClassicsCommandFramework();
    
    classicsCommandFramework.addCommand(new ClassicsPingCommand());
    
    classicsCommandFramework.addCommand(new ClassicsMessageToggleCommand());
    
    ClassicsMCCoreAPI.setClassicsCommandFramework(classicsCommandFramework);
    ClassicsMCCoreAPI.getClassicsCommandFramework().setCaseCheckingEnabled(false);
  }
  
  @Override
  public void onDisable() { }
  
}
