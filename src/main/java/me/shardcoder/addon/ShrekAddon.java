package me.shardcoder.addon;

import cc.hyperium.Hyperium;
import cc.hyperium.event.EventBus;
import cc.hyperium.event.InitializationEvent;
import cc.hyperium.event.InvokeEvent;
import cc.hyperium.internal.addons.IAddon;
import me.shardcoder.addon.commands.ShrekCommand;

public class ShrekAddon implements IAddon {

    @Override
    public void onLoad() {
        System.out.println("[Shrek] Addon loaded");
        
        EventBus.INSTANCE.register(this);
    }

    @InvokeEvent
    private void init(InitializationEvent event) {
        Hyperium.INSTANCE.getHandlers().getHyperiumCommandHandler().registerCommand(new ShrekCommand());
    }

    @Override
    public void onClose() {
        System.out.println("[Shrek] Addon closed");
    }
    
    @Override
    public void sendDebugInfo() {
    }
}
