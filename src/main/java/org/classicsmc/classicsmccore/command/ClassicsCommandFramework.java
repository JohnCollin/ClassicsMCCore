package org.classicsmc.classicsmccore.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.classicsmc.classicsmccore.api.ClassicsMCCoreAPI;
import org.classicsmc.classicsmccore.command.framework.ClassicsCommand;

import java.util.ArrayList;

public class ClassicsCommandFramework implements CommandExecutor {
  
  private boolean isCaseCheckingEnabled;
  
  private ArrayList<ClassicsCommand> classicsCommandArrayList;
  
  public ClassicsCommandFramework() {
    this.isCaseCheckingEnabled = false;
    
    this.classicsCommandArrayList = new ArrayList<>();
  }
  
  public void addCommand(ClassicsCommand classicsCommand) {
    classicsCommandArrayList.add(classicsCommand);
    
    final String classicsCommandAlias = classicsCommand.getAliases()[0];
    ClassicsMCCoreAPI.getClassicsMCCorePlugin().getCommand(classicsCommandAlias).setExecutor(this);
  }
  
  @Override
  public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
    String targetAlias = command.getName();
    
    for(ClassicsCommand classicsCommand : classicsCommandArrayList) {
      boolean aliasMatch = isCaseCheckingEnabled ?
        classicsCommand.aliasMatch(targetAlias) : classicsCommand.aliasMatchIgnoreCase(targetAlias);
      
      if(aliasMatch) {
        classicsCommand.performCommand(commandSender, command, args);
        return false;
      }
    }
    
    return false;
  }
  
  public boolean isCaseCheckingEnabled() {
    return isCaseCheckingEnabled;
  }
  
  public void setCaseCheckingEnabled(boolean caseCheckingEnabled) {
    isCaseCheckingEnabled = caseCheckingEnabled;
  }
  
  public ArrayList<ClassicsCommand> getClassicsCommandArrayList() {
    return classicsCommandArrayList;
  }
}
