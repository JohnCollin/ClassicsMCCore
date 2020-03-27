package org.classicsmc.classicsmccore.api;

import org.classicsmc.classicsmccore.ClassicsMCCore;
import org.classicsmc.classicsmccore.command.ClassicsCommandFramework;
import org.classicsmc.classicsmccore.player.ClassicsPlayerManager;

public abstract class ClassicsMCCoreAPI {
  
  private static ClassicsMCCore classicsMCCorePlugin;
  
  private static ClassicsPlayerManager classicsPlayerManager;
  
  private static ClassicsCommandFramework classicsCommandFramework;
  
  public static ClassicsMCCore getClassicsMCCorePlugin() {
    return classicsMCCorePlugin;
  }
  
  public static void setClassicsMCCorePlugin(ClassicsMCCore classicsMCCorePlugin) {
    ClassicsMCCoreAPI.classicsMCCorePlugin = classicsMCCorePlugin;
  }
  
  public static ClassicsCommandFramework getClassicsCommandFramework() {
    return classicsCommandFramework;
  }
  
  public static void setClassicsCommandFramework(ClassicsCommandFramework classicsCommandFramework) {
    ClassicsMCCoreAPI.classicsCommandFramework = classicsCommandFramework;
  }
  
  public static ClassicsPlayerManager getClassicsPlayerManager() {
    return classicsPlayerManager;
  }
  
  public static void setClassicsPlayerManager(ClassicsPlayerManager classicsPlayerManager) {
    ClassicsMCCoreAPI.classicsPlayerManager = classicsPlayerManager;
  }
}
