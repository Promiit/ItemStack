package me.promit.itemstack.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;



public class StackCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage(ChatColor.GREEN + "Thanks for using ItemStack! Developed by Promiit");

        return true;
    }
}
