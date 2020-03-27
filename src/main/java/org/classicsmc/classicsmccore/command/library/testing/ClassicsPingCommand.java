package org.classicsmc.classicsmccore.command.library.testing;

import org.classicsmc.classicsmccore.command.framework.ClassicsCommand;
import org.classicsmc.classicsmccore.command.framework.executable.ClassicsCommandExecutable;

public class ClassicsPingCommand extends ClassicsCommand {
  
  public static final String[] ALIASES = {"ping"};
  public static final ClassicsCommandExecutable CLASSICS_COMMAND_EXECUTABLE = (commandSender, command, args) -> {
    commandSender.sendMessage("Pong!");
  };
  
  public ClassicsPingCommand() {
    super(ALIASES, CLASSICS_COMMAND_EXECUTABLE);
  }
  
}
