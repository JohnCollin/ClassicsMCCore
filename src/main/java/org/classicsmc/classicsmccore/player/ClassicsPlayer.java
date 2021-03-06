package org.classicsmc.classicsmccore.player;

import org.bukkit.entity.Player;

import java.util.UUID;

public class ClassicsPlayer {
  
  private Player player;
  
  private boolean messageToggle;
  
  public ClassicsPlayer(Player player) {
    this.player = player;
  }
  
  public String getName() {
    return player.getName();
  }
  
  public UUID getUniqueID() {
    return player.getUniqueId();
  }
  
  public Player getPlayer() {
    return player;
  }
  
  public void setPlayer(Player player) {
    this.player = player;
  }
  
  public boolean getMessageToggle() {
    return messageToggle;
  }
  
  public void setMessageToggle(boolean messageToggle) {
    this.messageToggle = messageToggle;
  }
}
