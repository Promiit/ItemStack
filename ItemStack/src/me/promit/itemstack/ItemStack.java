package me.promit.itemstack;


import me.promit.itemstack.Commands.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;


public class ItemStack extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "STACK: ENABLED");

        StackDB db = new StackDB();
        this.getCommand("push").setExecutor(new PushCommand(db) );
        this.getCommand("pop").setExecutor(new PopCommand(db) );
        this.getCommand("peek").setExecutor(new PeekCommand(db) );
        this.getCommand("stacksize").setExecutor(new SizeCommand(db) );
        this.getCommand("stacktotal").setExecutor(new TotalCommand(db) );
        this.getCommand("stackfind").setExecutor(new FindCommand(db) );
        this.getCommand("stack").setExecutor(new StackCommand());

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "STACK: DISABLED");
    }
}
