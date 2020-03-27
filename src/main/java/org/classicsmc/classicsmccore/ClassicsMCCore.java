package org.classicsmc.classicsmccore;

import org.bukkit.plugin.java.JavaPlugin;
import org.classicsmc.classicsmccore.api.ClassicsMCCoreAPI;
import org.classicsmc.classicsmccore.command.ClassicsCommandFramework;
import org.classicsmc.classicsmccore.command.library.testing.ClassicsPingCommand;

public class ClassicsMCCore extends JavaPlugin {
  
  @Override
  public void onEnable() {
    ClassicsMCCoreAPI.setClassicsMCCorePlugin(this);
    
    setupCommandFramework();
  }
  
  private void setupCommandFramework() {
    ClassicsCommandFramework classicsCommandFramework;
    classicsCommandFramework = new ClassicsCommandFramework();
    
    classicsCommandFramework.addCommand(new ClassicsPingCommand());
    
    ClassicsMCCoreAPI.setClassicsCommandFramework(classicsCommandFramework);
    ClassicsMCCoreAPI.getClassicsCommandFramework().setCaseCheckingEnabled(false);
  }
  
  @Override
  public void onDisable() { }
  
}
