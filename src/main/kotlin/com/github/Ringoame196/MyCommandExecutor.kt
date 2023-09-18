package com.github.Ringoame196

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class MyCommandExecutor : CommandExecutor {
    @Override
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        // コマンドの処理を実装するロジックを記述@Override
        if (sender is Player) {
            sender.sendMessage("コマンドが実行されました！")
        }
        return true // コマンドが正常に処理された場合は true を返す
    }
}
