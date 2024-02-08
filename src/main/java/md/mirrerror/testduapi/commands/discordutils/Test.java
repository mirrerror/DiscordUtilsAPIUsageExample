package md.mirrerror.testduapi.commands.discordutils;

import md.mirrerror.discordutils.commands.SubCommand;
import md.mirrerror.discordutils.config.messages.Message;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.Collections;
import java.util.List;

public class Test implements SubCommand {
    @Override
    public void onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        System.out.println("Test command executed!");
    }

    @Override
    public String getName() {
        return "test";
    }

    @Override
    public String getPermission() {
        return "discordutils.discordutils.test";
    }

    @Override
    public List<String> getAliases() {
        return Collections.singletonList("t");
    }

    @Override
    public int getMinArgsNeeded() {
        return 0;
    }

    @Override
    public Message getIncorrectUsageErrorMessage() {
        return Message.UNKNOWN_ERROR;
    }
}
