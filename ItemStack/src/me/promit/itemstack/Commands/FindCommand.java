package me.promit.itemstack.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class FindCommand implements CommandExecutor {


    ArrayList<ItemStack> stack;


    public FindCommand (StackDB db) {
        this.stack = db.stack;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack item = player.getInventory().getItemInMainHand();

            if (item.getType().equals(Material.AIR)) {
                player.sendMessage(ChatColor.RED + "STACK: You can't find air in the stacK!");
                return true;
            }
            int totalEntries = 0;
            int totalQuantity = 0;
            for (int i = 0; i < stack.size(); i++) {
                if (stack.get(i).getType().equals(item.getType())) {
                    totalEntries += 1;
                    totalQuantity += stack.get(i).getAmount();
                }
            }

            player.sendMessage(ChatColor.GREEN + "STACK: There are " + totalEntries
                    + " unique entries of " + item.getType() + " in the stack, with a total" +
                    " quantity of " + totalQuantity + " to be popped!");
        }
        else {
            sender.sendMessage(ChatColor.RED + "STACK: This command must be entered by a player");
        }
        return true;
    }
}
