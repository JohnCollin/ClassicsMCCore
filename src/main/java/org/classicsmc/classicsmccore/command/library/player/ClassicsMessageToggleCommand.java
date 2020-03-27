package org.classicsmc.classicsmccore.command.library.player;

import org.bukkit.entity.Player;
import org.classicsmc.classicsmccore.api.ClassicsMCCoreAPI;
import org.classicsmc.classicsmccore.command.framework.ClassicsCommand;
import org.classicsmc.classicsmccore.command.framework.executable.ClassicsCommandExecutable;
import org.classicsmc.classicsmccore.player.ClassicsPlayer;

public class ClassicsMessageToggleCommand extends ClassicsCommand {
  
  public static final String[] ALIASES = {"msgtoggle", "emsgtoggle"};
  public static final ClassicsCommandExecutable CLASSICS_COMMAND_EXECUTABLE = (commandSender, command, args) -> {
    Player playerCommandSender;
    if((playerCommandSender = playerInstanceCheck(commandSender)) != null) {
      ClassicsPlayer classicsPlayer = ClassicsMCCoreAPI.getClassicsPlayerManager().getClassicsPlayer(playerCommandSender.getUniqueId());
      
      classicsPlayer.setMessageToggle(!classicsPlayer.getMessageToggle());
      
      //TODO Display A Fancy Message
      classicsPlayer.getPlayer().sendMessage(String.valueOf(classicsPlayer.getMessageToggle()));
    }
  };
  
  public ClassicsMessageToggleCommand() {
    super(ALIASES, CLASSICS_COMMAND_EXECUTABLE);
  }
  
}
