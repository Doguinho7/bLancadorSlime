package me.doguinho.addons.utils;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Lan�ador implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String arg2,
			String[] args) {
			if (!sender.hasPermission("lancador.admin")) {
				sender.sendMessage("�cVoce n�o possui permiss�o!");
				return true;
			}
			if (args.length == 0) {
				sender.sendMessage("�cUso correto: /lancador <jogador>!");
				return true;
			}
			Player p = Bukkit.getPlayer(args[0]);
			if (p == null) {
				sender.sendMessage("�cJogador n�o encontrado!");
				return true;
			}
			p.getInventory().addItem(LManager.getItem());
			sender.sendMessage("�eLancador enviado com sucesso!");

		return false;
	}
}