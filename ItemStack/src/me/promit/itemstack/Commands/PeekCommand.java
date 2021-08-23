package me.promit.itemstack.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class PeekCommand implements CommandExecutor {

    ArrayList<ItemStack> stack;


    public PeekCommand (StackDB db) {
        this.stack = db.stack;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (stack.size() < 1) {
                player.sendMessage(ChatColor.GREEN + "STACK: The stack is currently empty :(");
            }
            else {
                ItemStack item = stack.get(stack.size() - 1);
                player.sendMessage(ChatColor.GREEN + "STACK: The top item in the stack is "
                        + item.getType() + " (" + item.getAmount() + ")");
            }
        }
        else {
            sender.sendMessage(ChatColor.RED + "STACK: This command must be entered by a player");
        }
        return true;
    }
}
