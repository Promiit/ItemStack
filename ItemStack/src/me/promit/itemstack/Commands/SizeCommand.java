package me.promit.itemstack.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class SizeCommand implements CommandExecutor {

    ArrayList<ItemStack> stack;


    public SizeCommand (StackDB db) {
        this.stack = db.stack;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage(ChatColor.GREEN + "STACK: The current size of the stack is "
                + stack.size() + " (and counting!)");
        return true;
    }
}
