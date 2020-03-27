package org.classicsmc.classicsmccore.command.framework;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.classicsmc.classicsmccore.command.framework.executable.ClassicsCommandExecutable;

public abstract class ClassicsCommand {
  
  protected String[] aliases;
  
  protected ClassicsCommandExecutable classicsCommandExecutable;
  
  public ClassicsCommand(String[] aliases, ClassicsCommandExecutable classicsCommandExecutable) {
    this.aliases = aliases;
    
    this.classicsCommandExecutable = classicsCommandExecutable;
  }
  
  public void performCommand(CommandSender commandSender, Command command, String[] args) {
    classicsCommandExecutable.performCommand(commandSender, command, args);
  }
  
  public String[] getAliases() {
    return aliases;
  }
  
  public void setAliases(String[] aliases) {
    this.aliases = aliases;
  }
  
  public ClassicsCommandExecutable getClassicsCommandExecutable() {
    return classicsCommandExecutable;
  }
  
  public void setClassicsCommandExecutable(ClassicsCommandExecutable classicsCommandExecutable) {
    this.classicsCommandExecutable = classicsCommandExecutable;
  }
  
  public boolean aliasMatch(String targetAlias) {
    for(String alias : aliases) {
      if(alias.equals(targetAlias)) {
        return true;
      }
    }
    
    return false;
  }
  
  public boolean aliasMatchIgnoreCase(String targetAlias) {
    for(String alias : aliases) {
      if(alias.equalsIgnoreCase(targetAlias)) {
        return true;
      }
    }
    
    return false;
  }
}
