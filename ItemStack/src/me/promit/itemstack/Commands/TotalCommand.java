package me.promit.itemstack.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class TotalCommand implements CommandExecutor {

    ArrayList<ItemStack> stack;


    public TotalCommand (StackDB db) {
        this.stack = db.stack;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage(ChatColor.GREEN + "STACK: Counting ALL items in stack...");
        int total = 0;
        for (int i = 0; i < stack.size(); i++) {
            total = total + stack.get(i).getAmount();
        }
        sender.sendMessage(ChatColor.GREEN + "STACK: There are currently " + total
                + " total items in the stack!");
        return true;
    }
}
