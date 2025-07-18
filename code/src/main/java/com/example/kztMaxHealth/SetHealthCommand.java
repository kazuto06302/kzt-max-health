package com.example.kztMaxHealth;

import org.bukkit.Bukkit;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetHealthCommand implements CommandExecutor {

    private final MaxHealthManager plugin;

    public SetHealthCommand(MaxHealthManager plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 2) return false;

        Player target = Bukkit.getPlayer(args[0]);
        if (target == null) {
            sender.sendMessage("§cプレイヤーが見つかりません。");
            return true;
        }

        try {
            double health = Double.parseDouble(args[1]);
            target.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(health);
            sender.sendMessage("§a" + target.getName() + " の最大体力を " + health + " に設定しました。");
        } catch (NumberFormatException e) {
            sender.sendMessage("§c数値を入力してください。");
        }

        return true;
    }
}
