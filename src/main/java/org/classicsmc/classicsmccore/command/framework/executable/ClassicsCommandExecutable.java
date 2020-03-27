package org.classicsmc.classicsmccore.command.framework.executable;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public interface ClassicsCommandExecutable {
  
  public void performCommand(CommandSender commandSender, Command command, String[] args);
  
}
