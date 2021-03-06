package me.unraveledmc.unraveledmcmod.rank;

import org.bukkit.ChatColor;

public interface Displayable
{

    public String getName();

    public String getTag();

    public ChatColor getColor();

    public String getColoredName();

    public String getColoredTag();

    public String getColoredLoginMessage();
    
    public String getDeterminer();
    
    public String getItalicColoredName();

}
