package me.shardcoder.addon.commands;

import cc.hyperium.Hyperium;
import cc.hyperium.commands.BaseCommand;
import cc.hyperium.utils.ChatColor;
import java.awt.Color;
import java.util.Collections;
import java.util.List;

public class ShrekCommand implements BaseCommand {
    @Override
    public String getName() {
        return "shrek";
    }

    @Override
    public String getUsage() {
        return "/shrek";
    }

    @Override
    public void onExecute(String[] args) {
        Hyperium.INSTANCE.getNotification().display(ChatColor.translateAlternateColorCodes('&', "&2Sh&are&2k"), ChatColor.translateAlternateColorCodes('&', "&f#ShrekIsTheBestAnimeOfAllTime"), 5F, null,null, Color.GREEN);
    }

    @Override
    public List<String> getCommandAliases() {
        return null;
    }

    @Override
    public List<String> onTabComplete(String[] args) {
        return Collections.singletonList("shrek");
    }
}
