package me.promit.itemstack.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class PopCommand implements CommandExecutor {

    ArrayList<ItemStack> stack;


    public PopCommand (StackDB db) {
        this.stack = db.stack;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            int top = stack.size() - 1;
            if (top < 0) {
                player.sendMessage(ChatColor.RED + "STACK: Sorry, the stack is empty!");
                return true;
            }
            ItemStack item = stack.remove(top);
            player.getInventory().addItem(item);
            player.sendMessage(ChatColor.GREEN + "STACK: Successfully popped " + item.getType()
                    + " (" + item.getAmount() + ") from stack!");
        }
        else {
            sender.sendMessage(ChatColor.RED + "STACK: This command must be entered by a player");
        }
        return true;
    }
}
