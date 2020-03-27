package org.classicsmc.classicsmccore.player;

import org.bukkit.entity.Player;
import org.classicsmc.classicsmccore.api.ClassicsMCCoreAPI;

import java.util.ArrayList;
import java.util.UUID;

public class ClassicsPlayerManager {
  
  private ArrayList<ClassicsPlayer> classicsPlayers;
  
  public ClassicsPlayerManager() {
    this.classicsPlayers = new ArrayList<>();
  }
  
  public void addClassicsPlayer(ClassicsPlayer classicsPlayer) {
    classicsPlayers.add(classicsPlayer);
  }
  
  public void addClassicsPlayer(Player player) {
    //TODO Grab Player Save File and Configuration & Load Object using GSON
    
    classicsPlayers.add(new ClassicsPlayer(player));
  }
  
  public void addClassicsPlayer(UUID uniqueID) {
    //TODO Grab Player Save File and Configuration & Load Object using GSON
    
    final Player player = ClassicsMCCoreAPI.getClassicsMCCorePlugin().getServer().getPlayer(uniqueID);
  
    classicsPlayers.add(new ClassicsPlayer(player));
  }
  
  public ClassicsPlayer getClassicsPlayer(Player player) {
    for(ClassicsPlayer classicsPlayer : classicsPlayers) {
      if(classicsPlayer.getUniqueID().equals(player.getUniqueId())) {
        return classicsPlayer;
      }
    }
    
    //TODO DEBUG This seems to run every single time the same player runs the command.
    ClassicsMCCoreAPI.getClassicsMCCorePlugin().getLogger().info("Couldn't find preexisting config, creating a new one.");
    
    //TODO Grab Player Save File and Configuration & Load Object using GSON
  
    final ClassicsPlayer classicsPlayer;
    classicsPlayer = new ClassicsPlayer(player);
  
    return classicsPlayer;
  }
  
  public ClassicsPlayer getClassicsPlayer(UUID uniqueID) {
    for(ClassicsPlayer classicsPlayer : classicsPlayers) {
      if(classicsPlayer.getUniqueID().equals(uniqueID)) {
        return classicsPlayer;
      }
    }
  
    //TODO DEBUG This seems to run every single time the same player runs the command.
    ClassicsMCCoreAPI.getClassicsMCCorePlugin().getLogger().info("Couldn't find preexisting config, creating a new one.");
    
    //TODO Grab Player Save File and Configuration & Load Object using GSON
    
    final Player player = ClassicsMCCoreAPI.getClassicsMCCorePlugin().getServer().getPlayer(uniqueID);
    
    final ClassicsPlayer classicsPlayer;
    classicsPlayer = new ClassicsPlayer(player);
    
    return classicsPlayer;
  }
  
}
