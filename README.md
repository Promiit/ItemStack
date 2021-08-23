# Name: ItemStack
# Author: Promiit
Description: Minecraft Java Edition Plugin. Implements a global item stack data structure to use within game

Players can push items to a globally (server-wide) shared stack, and pop items from the top of the stack. Additional usage allows peeking into the stack and finding
information about items within the stack itself. Preserves quantity of items.

# Commands:
In-Game commands for players to use  
/push - Takes and removes the current item in a players hand (Besides air) and adds to the top of the global stack  
/pop - Pops the item from the top of the stack and into the players inventory  
/peek - Reveals (but doesn't remove) the item at the top of the stack  
/stacksize - Returns the number of entries in the stack (How many different pops)  
/stacktotal - Returns the number of items in the stack (Adding quantities of each entry)    
/stackfind - Matches players item in hand with all entries in stack to find the quantity of that item within the stack  

# Permissions:
Each command has it's own permission to assign players, depending on which one's you would like to make available.  
itemstack.push  
itemstack.pop  
itemstack.peek  
itemstack.stacksize  
itemstack.stacktotal  
itemstack.stackfind  

# Version info:
Currently updated to use SPIGOT 1.17.1  
Plugin ver 1.0.1  

