package me.promit.itemstack.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class PushCommand implements CommandExecutor {

    ArrayList<ItemStack> stack;


    public PushCommand (StackDB db) {
        this.stack = db.stack;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack item = player.getInventory().getItemInMainHand();
            if (item.getType().equals(Material.AIR)) {
                player.sendMessage(ChatColor.RED + "STACK: Sorry, you can't add air to the stack!");
                return true;
            }
            player.getInventory().removeItem(item);

            stack.add(item);
            player.sendMessage(ChatColor.GREEN + "STACK: Successfully added " + item.getType()
                    + " (" + item.getAmount() + ") to stack!");
        }
        else {
            sender.sendMessage(ChatColor.RED + "STACK: This command must be entered by a player");
        }
        return true;
    }
}
