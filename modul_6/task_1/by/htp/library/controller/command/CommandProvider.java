package by.htp.library.controller.command;

import by.htp.library.controller.command.impl.AddBookCommand;
import by.htp.library.controller.command.impl.LoginationCommand;
import by.htp.library.controller.command.impl.RemoveBookCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private Map<String, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put("admin",new LoginationCommand());
        commands.put("user", new LoginationCommand());
        commands.put("add_new_book", new AddBookCommand());
        commands.put("remove_book",new RemoveBookCommand());
    }

    public Command getCommand (String commandName) {
        Command command;
        command = commands.get(commandName);
        return command;
    }
}
