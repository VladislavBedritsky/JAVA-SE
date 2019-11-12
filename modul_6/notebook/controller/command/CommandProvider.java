package by.htp.notebook.controller.command;

import by.htp.notebook.controller.command.impl.AddNewNoteCommand;
import by.htp.notebook.controller.command.impl.RemoveNoteCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

        private Map<String,Command> commands = new HashMap<>();

        public CommandProvider () {
            commands.put("add_note",new AddNewNoteCommand());
            commands.put("remove_note",new RemoveNoteCommand());
        }

        public Command getCommand (String commandName) {
            Command command;
            command = commands.get(commandName);
            return command;
        }

}
